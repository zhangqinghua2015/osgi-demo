package com.zqh.osgi.demo6;

import com.zqh.osgi.demo1.ICalculation;

/**
 * @discription:
 * @date: 2019/08/27 19:12
 */
public class DIWithBlueprint {

    private ICalculation calculator;

    public void setCalculator(ICalculation service) {
        this.calculator = service;
        System.out.println();
        System.out.print("DIWithBlueprint call: " );
        calculator.say();
    }

}
