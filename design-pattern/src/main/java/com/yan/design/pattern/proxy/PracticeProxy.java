package com.yan.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yanyuyao
 */
public class PracticeProxy implements InvocationHandler {

    private Target target;

    public Object createProxy(Target target) {
        // 传入真实实现类，实现类的功能由本身去做，代理类只增强
        this.target = target;
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类前增强处理");
        Object invoke = method.invoke(target, args);
        System.out.println("代理类后增强处理");
        return invoke;
    }
}
