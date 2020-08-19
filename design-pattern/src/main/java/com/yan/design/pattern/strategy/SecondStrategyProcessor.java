package com.yan.design.pattern.strategy;

/**
 * @author yanyuyao
 */
public class SecondStrategyProcessor implements Processor {

    @Override
    public void process() {
        System.out.println("第二策略处理");
    }
}
