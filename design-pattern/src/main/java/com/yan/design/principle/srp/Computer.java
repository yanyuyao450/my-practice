package com.yan.design.principle.srp;

/**
 * @author yanyuyao
 */
public class Computer {

    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public void getDetail() {
        System.out.println("Cpu:" + cpu.getName());
        System.out.println("Memory:" + memory.getName());
        System.out.println("Disk:" + disk.getName());
    }
}
