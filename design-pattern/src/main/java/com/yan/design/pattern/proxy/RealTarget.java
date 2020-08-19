package com.yan.design.pattern.proxy;

/**
 * @author yanyuyao
 */
public class RealTarget implements Target {
    public void targetExecution() {
        System.out.println("目标执行");
    }
}
