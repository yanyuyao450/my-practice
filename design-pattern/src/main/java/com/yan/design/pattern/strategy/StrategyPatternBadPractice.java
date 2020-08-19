package com.yan.design.pattern.strategy;

/**
 * @author yanyuyao
 */
public class StrategyPatternBadPractice {

    public static void main(String[] args) {
        FirstStrategyProcessor first = new FirstStrategyProcessor();
        first.process();
        System.out.println("====================");
        SecondStrategyProcessor second = new SecondStrategyProcessor();
        second.process();

        // todo 如果需要业务迭代第三种ThirdStrategyProcessor时如何处理
    }
}
