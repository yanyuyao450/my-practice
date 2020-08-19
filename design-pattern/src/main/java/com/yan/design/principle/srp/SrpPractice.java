package com.yan.design.principle.srp;

/**
 * @author yanyuyao
 */
public class SrpPractice {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new Cpu("Core i5"));
        computer.setMemory(new Memory("8G"));
        computer.setDisk(new Disk("HDD"));
        computer.getDetail();

        // 升级配件
        computer.setCpu(new Cpu("Core i7"));
        computer.setMemory(new Memory("16G"));
        computer.setDisk(new Disk("SSD"));
        computer.getDetail();
    }
}
