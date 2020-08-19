package com.yan.design.pattern.proxy;

/**
 * @author yanyuyao
 */
public class ProxyPatternPractice {

    public static void main(String[] args) {
        PracticeProxy proxy = new PracticeProxy();
        Target target = (Target) proxy.createProxy(new RealTarget());
        target.targetExecution();
    }
}
