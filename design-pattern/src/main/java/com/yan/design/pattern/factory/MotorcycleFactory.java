package com.yan.design.pattern.factory;

/**
 * @author yanyuyao
 */
public class MotorcycleFactory {

    public Motorcycle buy(int money) {
        System.out.println("X总消费" + money + "元");
        if (money <= 10000) {
            return new Scooter();
        } else if (money <= 20000) {
            return new StreetMotor();
        } else {
            return new SportsMotor();
        }
    }
}
