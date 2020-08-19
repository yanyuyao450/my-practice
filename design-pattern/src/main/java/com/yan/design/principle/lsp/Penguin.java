package com.yan.design.principle.lsp;

/**
 * @author yanyuyao
 */
public class Penguin extends Bird {

    @Override
    public void setSpeed(double speed) {
        super.setSpeed(0);
    }
}
