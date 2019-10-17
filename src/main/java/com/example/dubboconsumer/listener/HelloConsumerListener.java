package com.example.dubboconsumer.listener;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.listener.InvokerListenerAdapter;

/**
 * @description:
 * @author: chengang6
 * @create: 2019/5/21 23:20
 **/
@Activate
public class HelloConsumerListener extends InvokerListenerAdapter {
    @Override
    public void referred(Invoker<?> invoker) throws RpcException {
        System.out.println(">>>>>>>>>>>>>>>HelloConsumerListener");
    }
}
