package com.limingyan.aop.impl;

import com.limingyan.aop.Cal;

public class CalImpl implements Cal {
    @Override
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        return num1 / num2;
    }
}
