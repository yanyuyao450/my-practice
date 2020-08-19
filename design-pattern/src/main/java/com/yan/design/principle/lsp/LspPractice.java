package com.yan.design.principle.lsp;

/**
 * @author yanyuyao
 */
public class LspPractice {

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.setSpeed(100);
        System.out.println("一只鹰飞行10公里需要" + eagle.getFlyTime(10) + "小时");

        //动物园新引进一只企鹅 企鹅不会飞
        Penguin penguin = new Penguin();
        penguin.setSpeed(100);
        System.out.println("一只企鹅飞行10公里需要" + penguin.getFlyTime(10) + "小时");
    }
}
