package com.yan.design.principle.srp;

/**
 * @author yanyuyao
 */
public class BadComputer {

    private String cpu = "Core i5";
    private String memory = "8G";
    private String disk = "HDD";

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void getDetail() {
        System.out.println("Cpu:" + cpu);
        System.out.println("Memory:" + memory);
        System.out.println("Disk:" + disk);
    }
}
