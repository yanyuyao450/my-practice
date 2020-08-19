package com.yan.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yanyuyao
 */
public class Watcher implements Observer {

    public Watcher(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        System.out.println("观察到目标状态发生改变:" + ((WatchedTarget) o).getData());
    }
}
