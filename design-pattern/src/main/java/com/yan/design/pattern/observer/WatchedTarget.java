package com.yan.design.pattern.observer;

import java.util.Observable;

/**
 * @author yanyuyao
 */
public class WatchedTarget extends Observable {

    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (!this.data.equals(data)) {
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }
}
