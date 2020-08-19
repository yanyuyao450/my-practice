package com.yan.design.pattern.state;

/**
 * @author yanyuyao
 */
public class StatePatternPractice {

    public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero();
        hero.startRun();
        hero.setState(new AttackBattleState());
        Thread.sleep(1000);
        hero.setState(new UseSkillBattleState());
        Thread.sleep(1000);
        hero.setState(new EscapeBattleState());
        Thread.sleep(1000);
        hero.stopRun();
    }
}
