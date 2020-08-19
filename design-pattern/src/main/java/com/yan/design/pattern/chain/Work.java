package com.yan.design.pattern.chain;

public class Work extends AbstractBehavior {
    @Override
    void doBehavior(String behavior) {
        if ("work".equalsIgnoreCase(behavior)) {
            System.out.println("工作");
        } else {
            System.out.println("无可用处理节点");
        }
    }
}
