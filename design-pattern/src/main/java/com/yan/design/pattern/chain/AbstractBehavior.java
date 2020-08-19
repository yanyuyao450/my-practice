package com.yan.design.pattern.chain;

/**
 * @author yanyuyao
 */
public abstract class AbstractBehavior {

    AbstractBehavior nextBehavior;

    public void setAbstractBehavior(AbstractBehavior nextBehavior) {
        this.nextBehavior = nextBehavior;
    }

    abstract void doBehavior(String behavior);
}
