package com.yan.design.pattern.adapter;

/**
 * @author yanyuyao
 */
public class AdapterPatternPractice {

    public static void main(String[] args) {
        Mac mac = new Mac();
        mac.typeC("typeC");
        mac.typeC("vga");
        mac.typeC("hdmi");
    }
}
