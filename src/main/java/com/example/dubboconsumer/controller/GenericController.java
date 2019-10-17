package com.example.dubboconsumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.service.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: chengang6
 * @create: 2019/5/22 23:34
 **/
@RestController
public class GenericController {
    /**
     * 通用服务调用，当没有provider提供的jar包时，可以使用这种方式进行调用
     * 注意：当使用这种方式调用时，同一个jVM内的相同服务，将不可用，例如：
     * @Reference
     * private HelloDubboService helloDubboService;将不可用
     */
//    @Reference(generic = true, interfaceName = "com.example.dubboprovider.service.HelloDubboService")
//    private GenericService genericService;
//
//    @RequestMapping("/generic")
//    public String generic() {
//        String say = (String) genericService.$invoke("say", new String[0], new Object[0]);
//        return say;
//    }
}
