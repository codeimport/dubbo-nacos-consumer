package com.example.dubboconsumer.mock;

import com.example.dubboprovider.service.HelloDubboService;

/**
 * @description: 当调用provider返回RpcException时，会使用Mock数据代替provider，相当与降级
 * @author: chengang6
 * @create: 2019/5/22 17:16
 **/
public class HelloServiceMock implements HelloDubboService {
    @Override
    public String say() {
        return "mock-say";
    }

    @Override
    public String hello() {
        return "mock-hello";
    }

    @Override
    public String post(String key) {
        return "mock-post";
    }
}
