package com.yan.design.pattern.state.bad;

/**
 * @author yanyuyao
 */
public class StatePatternBadPractice {

    public static void main(String[] args) throws InterruptedException {
        HeroBad heroBad = new HeroBad();
        heroBad.startRun();
        heroBad.setState(HeroBad.ATTACK);
        Thread.sleep(1000);
        heroBad.setState(HeroBad.USE_SKILL);
        Thread.sleep(1000);
        heroBad.setState(HeroBad.ESCAPE);
        Thread.sleep(1000);
        heroBad.stopRun();
    }
}
