package com.design.mode.factory.entity.simple;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:36
 * @description 意大利腊肠披萨
 */
public class PepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("PepperoniPizza prepare...");
    }

    @Override
    public void bake() {
        System.out.println("PepperoniPizza bake...");
    }

    @Override
    public void cut() {
        System.out.println("PepperoniPizza cut...");
    }

    @Override
    public void box() {
        System.out.println("PepperoniPizza box...");
    }
}
