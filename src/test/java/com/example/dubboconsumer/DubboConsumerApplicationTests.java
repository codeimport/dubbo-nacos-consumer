package com.example.dubboconsumer;

import com.example.dubboprovider.service.HelloDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboConsumerApplicationTests {
    @Reference(retries = 2)
    private HelloDubboService helloDubboService;

    @Test
    @Ignore
    public void testSay() {
        System.out.println(">>>>>>>>>>>>>>>Say:" + helloDubboService.say());
    }

    @Test
    public void testHello() {
        System.out.println(">>>>>>>>>>>>>>>Hello:" + helloDubboService.hello());
    }

}
