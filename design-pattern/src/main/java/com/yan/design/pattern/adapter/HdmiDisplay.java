package com.yan.design.pattern.adapter;

/**
 * @author yanyuyao
 */
public class HdmiDisplay implements AdvancedComputer {
    public void vga() {

    }

    public void hdmi() {
        System.out.println("接入HDMI接口显示器");
    }
}
