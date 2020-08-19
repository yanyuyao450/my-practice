package com.yan.design.pattern.factory;

/**
 * @author yanyuyao
 */
public class FactoryPatternPractice {

    public static void main(String[] args) {
        MotorcycleFactory motorcycleFactory = new MotorcycleFactory();

        Motorcycle motor1 = motorcycleFactory.buy(9800);
        motor1.getOne();

        System.out.println("===============");

        Motorcycle motor2 = motorcycleFactory.buy(15000);
        motor2.getOne();

        System.out.println("===============");

        Motorcycle motor3 = motorcycleFactory.buy(21680);
        motor3.getOne();

    }
}
