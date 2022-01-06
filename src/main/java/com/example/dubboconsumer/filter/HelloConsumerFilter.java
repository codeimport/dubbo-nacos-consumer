package com.example.dubboconsumer.filter;

import org.apache.dubbo.rpc.*;

/**
 * @description:
 * @author: chengang6
 * @create: 2019/5/21 11:52
 **/
//@Activate(group = "consumer", order = 1)
public class HelloConsumerFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation inv) throws RpcException {
        String value1=invoker.getUrl().getParameter("key1");
        System.out.println(">>>>>>>>>>>HelloConsumerFilter:invoke");
        return invoker.invoke(inv);
    }
}
