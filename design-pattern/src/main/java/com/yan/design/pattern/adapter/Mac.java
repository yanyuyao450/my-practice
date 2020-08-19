package com.yan.design.pattern.adapter;

public class Mac implements Computer {

    private ComputerAdapter computerAdapter;

    public void typeC(String type) {
        if ("typeC".equalsIgnoreCase(type)) {
            System.out.println("使用typeC接口显示器");
        } else {
            computerAdapter = new ComputerAdapter(type);
            computerAdapter.typeC(type);
        }
    }
}
