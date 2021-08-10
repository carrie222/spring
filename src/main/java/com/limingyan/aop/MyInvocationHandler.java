package com.limingyan.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
    // 委托对象
    private Object object = null;

    //返回代理对象
    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance( );
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
