package com.design.mode.template.function.beverage;

import java.util.Scanner;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 15:41
 * @description 咖啡
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }


}
