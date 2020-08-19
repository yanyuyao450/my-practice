package com.yan.design.pattern.chain;

public class Drink extends AbstractBehavior {
    @Override
    void doBehavior(String behavior) {
        if ("drink".equalsIgnoreCase(behavior)) {
            System.out.println("喝");
        } else {
            nextBehavior.doBehavior(behavior);
        }
    }
}
