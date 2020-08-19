package com.yan.design.pattern.state.bad;

/**
 * @author yanyuyao
 */
public class HeroBad {

    public static final int COMMON = 1;
    public static final int ATTACK = 2;
    public static final int USE_SKILL = 3;
    public static final int ESCAPE = 4;

    private int state = COMMON;

    private Thread thread;

    public void setState(int state) {
        this.state = state;
    }

    public void stopRun() {
        if (isRunning()) {
            thread.interrupt();
        }
        System.out.println("=======团灭======");
    }

    public void startRun() {
        if (isRunning()) {
            return;
        }
        final HeroBad heroBad = this;
        thread = new Thread(new Runnable() {
            public void run() {
                while (!thread.isInterrupted()) {
                    try {
                        heroBad.battle();
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        });
        System.out.println("=======全军出击======");
        thread.start();
    }

    private boolean isRunning() {
        return thread != null && !thread.isInterrupted();
    }

    private void battle() throws InterruptedException {
        if (state == ATTACK) {
            System.out.println("=======普通攻击======");
            state = COMMON;
            System.out.println("=======普通攻击结束======");
        } else if (state == USE_SKILL) {
            System.out.println("=======施放技能======");
            state = COMMON;
            System.out.println("=======施放技能结束======");
        } else if (state == ESCAPE) {
            System.out.println("=======逃跑======");
            state = COMMON;
        }
    }
}
