package com.yan.design.pattern.strategy;

/**
 * @author yanyuyao
 */
public class FirstStrategyProcessor implements Processor {

    @Override
    public void process() {
        System.out.println("第一策略处理");
    }
}
