package com.example.dubboconsumer.controller;

import com.example.dubboprovider.service.HelloDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: chengang6
 * @create: 2019/5/23 10:23
 **/
@RestController
public class HelloOtherReferenceController {
    @Reference(owner = "chengang")
    private HelloDubboService helloDubboService1;

    @RequestMapping("post")
    public String post(){
        System.out.println(">>>>>>>>>>>>>>>post()");
        String value= helloDubboService1.post("mykey");
        return value;
    }
}
