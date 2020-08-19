package com.yan.design.principle.dip;

/**
 * @author yanyuyao
 */
public class DipPractice {

    public static void main(String[] args) {
        Richer richer = new Richer();
        richer.drive(new Ferrari());
        // 不想开法拉利了 新买了一辆保时捷
        richer.drive(new Porsche());

        // 要是土豪的儿子也想开怎么办
        richer.badDrive();
    }
}
