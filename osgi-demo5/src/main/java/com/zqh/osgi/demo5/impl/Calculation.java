package com.zqh.osgi.demo5.impl;

import com.zqh.osgi.demo1.ICalculation;

/**
 *
 * @discription:
 * @date: 2019/08/26 20:10
 */
public class Calculation implements ICalculation {
    @Override
    public void say() {
        System.out.println("Calculation Success!");
    }
}
