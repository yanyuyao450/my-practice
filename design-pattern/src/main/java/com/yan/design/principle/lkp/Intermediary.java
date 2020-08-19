package com.yan.design.principle.lkp;

/**
 * @author yanyuyao
 */
public class Intermediary {

    private HouseOwner houseOwner;
    private HouseRenter houseRenter;

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public void setHouseRenter(HouseRenter houseRenter) {
        this.houseRenter = houseRenter;
    }

    public void rent() {
        System.out.println(houseOwner.getName() + "出租房屋给" + houseRenter.getName());
    }
}
