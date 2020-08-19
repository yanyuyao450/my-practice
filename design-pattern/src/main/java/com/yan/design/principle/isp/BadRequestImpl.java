package com.yan.design.principle.isp;

/**
 * @author yanyuyao
 */
public class BadRequestImpl implements BadMvc {

    @Override
    public void handleRequest() {
        System.out.println("收到请求");
        System.out.println("查询");
        System.out.println("业务处理");
    }
}
