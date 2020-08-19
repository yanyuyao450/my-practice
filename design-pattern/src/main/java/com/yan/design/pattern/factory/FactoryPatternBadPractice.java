package com.yan.design.pattern.factory;

/**
 * @author yanyuyao
 */
public class FactoryPatternBadPractice {

    public static void main(String[] args) {
        int money = 9800;
        System.out.println("X总消费" + money + "元");
        if (money <= 10000) {
            Scooter scooter = new Scooter();
            scooter.getOne();
        } else if (money <= 20000) {
            StreetMotor streetMotor = new StreetMotor();
            streetMotor.getOne();
        } else {
            SportsMotor sportsMotor = new SportsMotor();
            sportsMotor.getOne();
        }
        System.out.println("===============");


        int money1 = 15000;
        System.out.println("X总消费" + money1 + "元");
        if (money1 <= 10000) {
            Scooter scooter = new Scooter();
            scooter.getOne();
        } else if (money1 <= 20000) {
            StreetMotor streetMotor = new StreetMotor();
            streetMotor.getOne();
        } else {
            SportsMotor sportsMotor = new SportsMotor();
            sportsMotor.getOne();
        }
        System.out.println("===============");

        int money2 = 21680;
        System.out.println("X总消费" + money2 + "元");
        if (money2 <= 10000) {
            Scooter scooter = new Scooter();
            scooter.getOne();
        } else if (money2 <= 20000) {
            StreetMotor streetMotor = new StreetMotor();
            streetMotor.getOne();
        } else {
            SportsMotor sportsMotor = new SportsMotor();
            sportsMotor.getOne();
        }

        //todo 想买个别的类型车
    }
}
