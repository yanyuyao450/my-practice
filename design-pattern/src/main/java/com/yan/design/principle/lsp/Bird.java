package com.yan.design.principle.lsp;

/**
 * @author yanyuyao
 */
public class Bird {

    private double speed;

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFlyTime(double distance) {
        return distance / speed;
    }
}
