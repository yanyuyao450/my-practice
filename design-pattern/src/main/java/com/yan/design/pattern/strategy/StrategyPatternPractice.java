package com.yan.design.pattern.strategy;

/**
 * @author yanyuyao
 */
public class StrategyPatternPractice {

    public static void main(String[] args) {
        ProcessorStrategy strategy = new ProcessorStrategy(new FirstStrategyProcessor());
        strategy.execute();
        System.out.println("====================");
        ProcessorStrategy strategy1 = new ProcessorStrategy(new SecondStrategyProcessor());
        strategy1.execute();
    }
}
