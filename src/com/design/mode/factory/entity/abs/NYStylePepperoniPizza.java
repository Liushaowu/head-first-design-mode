package com.design.mode.factory.entity.abs;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:36
 * @description 纽约意大利腊肠披萨
 */
public class NYStylePepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("NYStylePepperoniPizza prepare...");
    }

    @Override
    public void bake() {
        System.out.println("NYStylePepperoniPizza bake...");
    }

    @Override
    public void cut() {
        System.out.println("NYStylePepperoniPizza cut...");
    }

    @Override
    public void box() {
        System.out.println("NYStylePepperoniPizza box...");
    }
}
