package com.yan.design.pattern.chain;

public class Play extends AbstractBehavior {
    @Override
    void doBehavior(String behavior) {
        if ("play".equalsIgnoreCase(behavior)) {
            System.out.println("玩");
        } else {
            nextBehavior.doBehavior(behavior);
        }
    }
}
