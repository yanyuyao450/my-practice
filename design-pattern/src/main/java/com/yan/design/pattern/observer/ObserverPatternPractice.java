package com.yan.design.pattern.observer;

/**
 * @author yanyuyao
 */
public class ObserverPatternPractice {

    public static void main(String[] args) {
        WatchedTarget watchedTarget = new WatchedTarget();
        //需要创建观察者 并注册观察者
        Watcher watcher = new Watcher(watchedTarget);

        watchedTarget.setData("step1");
        watchedTarget.setData("step2");
        watchedTarget.setData("step3");
    }
}
