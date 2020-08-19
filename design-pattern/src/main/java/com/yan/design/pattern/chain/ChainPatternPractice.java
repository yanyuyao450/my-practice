package com.yan.design.pattern.chain;

/**
 * @author yanyuyao
 */
public class ChainPatternPractice {

    public static void main(String[] args) {
        AbstractBehavior behavior = buildChain();

        behavior.doBehavior("eat");
        behavior.doBehavior("drink");
        behavior.doBehavior("play");
        behavior.doBehavior("work");
        behavior.doBehavior("happy");
    }

    private static AbstractBehavior buildChain() {
        Eat eat = new Eat();
        Drink drink = new Drink();
        Play play = new Play();
        Work work = new Work();

        eat.setAbstractBehavior(drink);
        drink.setAbstractBehavior(play);
        play.setAbstractBehavior(work);

        return eat;
    }
}
