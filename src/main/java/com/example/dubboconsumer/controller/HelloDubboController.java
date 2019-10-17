package com.example.dubboconsumer.controller;

import com.example.dubboprovider.service.HelloDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: chengang6
 * @create: 2019/5/11 21:31
 **/
@RestController
public class HelloDubboController {
//    @Reference(filter = {"helloConsumer", "helloConsumer2"}, listener = {"helloConsumerListener"}, parameters = {"key1", "value1"}, mock = "com.example.dubboconsumer.mock.HelloServiceMock", stub = "com.example.dubboconsumer.stub.HelloDubboServiceStub", onconnect = "onconnect")
//    @Reference(check = false,filter = {"helloConsumer","helloConsumer2"},listener = {"helloConsumerListener"},parameters = {"key1","value1"},mock = "com.example.dubboconsumer.mock.HelloServiceMock",onconnect = "onconnect")
//    @Reference(onconnect = "onconnect",mock = "com.example.dubboconsumer.mock.HelloServiceMock")
    @Reference(async = true)
    private HelloDubboService helloDubboService;

    public void onconnect(){
        System.out.println(">>>>>>>>>>>>>>>>>onconnect()");
    }

    @RequestMapping("say")
    public String say() {
        System.out.println(">>>>>>>>>>>>>>>say()");
        long time1=System.currentTimeMillis();
        String name = helloDubboService.say();
        long time2=System.currentTimeMillis();
        RpcContext.getContext().getFuture();
        System.out.println("time2-time1="+(time2-time1));
        return name;
    }

    @RequestMapping("hello")
    public String hello() {
        System.out.println(">>>>>>>>>>>>>>>hello()");
        String name = helloDubboService.hello();
        return name;
    }

}
