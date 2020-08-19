package com.yan.design.principle.isp;

/**
 * @author yanyuyao
 */
public class IspPractice {

    public static void main(String[] args) {
        RequestImpl request = new RequestImpl();
        request.mappingRequest();
        request.query();
        request.process();

        BadRequestImpl badRequest = new BadRequestImpl();
        badRequest.handleRequest();
        //如果收到一个新的请求 或需要修改处理方式
    }
}
