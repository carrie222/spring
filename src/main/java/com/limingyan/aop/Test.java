package com.limingyan.aop;

import com.limingyan.aop.impl.CalImpl;

public class Test {
    public static void main(String[] args) {
        // 实例化委托对象
        Cal cal = new CalImpl();
        // 获取动态代理
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal proxy = (Cal) myInvocationHandler.bind(cal);
        proxy.add(10,3);
        proxy.sub(10,3);

    }
}
