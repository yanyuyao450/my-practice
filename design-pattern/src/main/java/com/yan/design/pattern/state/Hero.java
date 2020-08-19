package com.yan.design.pattern.state;

/**
 * @author yanyuyao
 */
public class Hero {

    private Thread thread;

    private BattleState battleState = new CommonBattleState();

    public void setState(BattleState battleState) {
        this.battleState = battleState;
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
        final Hero hero = this;
        thread = new Thread(new Runnable() {
            public void run() {
                while (!thread.isInterrupted()) {
                    try {
                        battleState.action(hero);
                    } catch (Exception e) {
                        e.printStackTrace();
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
}
