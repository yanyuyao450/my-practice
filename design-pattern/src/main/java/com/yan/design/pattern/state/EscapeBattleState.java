package com.yan.design.pattern.state;

/**
 * @author yanyuyao
 */
public class EscapeBattleState implements BattleState {
    public void action(Hero hero) {
        System.out.println("=======逃跑======");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hero.setState(new CommonBattleState());
    }
}
