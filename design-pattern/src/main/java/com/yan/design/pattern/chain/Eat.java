package com.yan.design.pattern.chain;

public class Eat extends AbstractBehavior {
    @Override
    void doBehavior(String behavior) {
        if ("eat".equalsIgnoreCase(behavior)) {
            System.out.println("吃");
        } else {
            nextBehavior.doBehavior(behavior);
        }
    }
}
