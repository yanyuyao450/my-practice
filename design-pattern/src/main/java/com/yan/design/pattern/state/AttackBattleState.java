package com.yan.design.pattern.state;

/**
 * @author yanyuyao
 */
public class AttackBattleState implements BattleState {
    public void action(Hero hero) {
        System.out.println("=======普通攻击======");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       hero.setState(new CommonBattleState());
        System.out.println("=======普通攻击结束======");
    }
}
