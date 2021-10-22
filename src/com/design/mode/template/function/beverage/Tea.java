package com.design.mode.template.function.beverage;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 15:40
 * @description 茶
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Ading Lemon");
    }
}
