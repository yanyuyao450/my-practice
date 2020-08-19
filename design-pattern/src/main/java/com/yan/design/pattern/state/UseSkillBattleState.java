package com.yan.design.pattern.state;

/**
 * @author yanyuyao
 */
public class UseSkillBattleState implements BattleState {
    public void action(Hero hero) {
        System.out.println("=======施放技能======");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hero.setState(new CommonBattleState());
        System.out.println("=======施放技能结束======");
    }
}
