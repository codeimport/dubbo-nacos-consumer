package com.example.dubboconsumer.stub;

import com.example.dubboprovider.service.HelloDubboService;

/**
 * @description: 本地Mock数据，可以控制是否调用远端Provider
 * @author: chengang6
 * @create: 2019/5/22 23:25
 **/
public class HelloDubboServiceStub implements HelloDubboService {
    private HelloDubboService helloDubboService;

    public HelloDubboServiceStub(HelloDubboService helloDubboService) {
        this.helloDubboService = helloDubboService;
    }

    @Override
    public String say() {
//        return helloDubboService.say(); //可以使用远端服务
        return ">>>>>>>>>>>>>>>HelloDubboServiceStub:say()";
    }

    @Override
    public String hello() {
        return ">>>>>>>>>>>>>>>HelloDubboServiceStub:hello()";
    }

    @Override
    public String post(String key) {
        return ">>>>>>>>>>>>>>>HelloDubboServiceStub:post()";
    }
}
