package com.yan.design.principle.ocp;

/**
 * @author yanyuyao
 */
public class FilterBad {
    void filter() {
        System.out.println("第一种过滤");
        // 需要新的过滤器
        System.out.println("第二种过滤");
    }
}
