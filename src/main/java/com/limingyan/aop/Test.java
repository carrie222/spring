package com.limingyan.aop;

import com.limingyan.aop.impl.CalImpl;

public class Test {
    public static void main(String[] args) {
        Cal cal = new CalImpl();
        cal.add(10,3);
        cal.sub(10,3);
        cal.mul(10,3);
        cal.div(10,3);
    }
}
