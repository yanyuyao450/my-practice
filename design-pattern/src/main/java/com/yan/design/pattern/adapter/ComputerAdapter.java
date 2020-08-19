package com.yan.design.pattern.adapter;

/**
 * @author yanyuyao
 */
public class ComputerAdapter implements Computer {

    AdvancedComputer advancedComputer;

    public ComputerAdapter(String type) {
        if ("vga".equalsIgnoreCase(type)) {
            advancedComputer = new VgaDisplay();
        } else if ("hdmi".equalsIgnoreCase(type)) {
            advancedComputer = new HdmiDisplay();
        }
    }

    public void typeC(String type) {
        if ("vga".equalsIgnoreCase(type)) {
            System.out.println("typeC转VGA");
            advancedComputer.vga();
        } else if ("hdmi".equalsIgnoreCase(type)) {
            System.out.println("typeC转HDMI");
            advancedComputer.hdmi();
        }
    }
}
