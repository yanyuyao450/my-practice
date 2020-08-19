package com.yan.design.principle.isp;

/**
 * @author yanyuyao
 */
public class RequestImpl implements Controller, Service, Dao {

    @Override
    public void mappingRequest() {
        System.out.println("收到请求");
    }

    @Override
    public void query() {
        System.out.println("查询");
    }

    @Override
    public void process() {
        System.out.println("业务处理");
    }
}
