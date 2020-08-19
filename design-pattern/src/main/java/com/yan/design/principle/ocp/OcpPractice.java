package com.yan.design.principle.ocp;

/**
 * @author yanyuyao
 */
public class OcpPractice {

    public static void main(String[] args) {
        AbstractFilter filter = new Filter1();
        filter.filter();

        // 当需要一个新的过滤器的时候如何迭代？
        AbstractFilter filter1 = new Filter2();
        filter1.filter();
    }
}
