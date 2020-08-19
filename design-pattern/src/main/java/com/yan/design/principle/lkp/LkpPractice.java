package com.yan.design.principle.lkp;

/**
 * @author yanyuyao
 */
public class LkpPractice {

    public static void main(String[] args) {
        Intermediary intermediary = new Intermediary();
        intermediary.setHouseOwner(new HouseOwner("房东"));
        intermediary.setHouseRenter(new HouseRenter("租户"));

        intermediary.rent();
    }
}
