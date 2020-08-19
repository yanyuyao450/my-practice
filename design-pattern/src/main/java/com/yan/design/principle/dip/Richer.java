package com.yan.design.principle.dip;

/**
 * @author yanyuyao
 */
public class Richer {

    public void drive(AbstractHyperCar hyperCar) {
        hyperCar.run();
    }

    public void badDrive() {
        Ferrari ferrari = new Ferrari();
        ferrari.run();
        // 不想开法拉利了 新买了一辆保时捷
        Porsche porsche = new Porsche();
        porsche.run();
    }
}
