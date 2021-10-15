package com.design.mode.factory.entity.function;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:34
 * @description 芝士披萨
 */
public class NYStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NYStyleCheesePizza prepare...");
    }

    @Override
    public void bake() {
        System.out.println("NYStyleCheesePizza bake...");
    }

    @Override
    public void cut() {
        System.out.println("NYStyleCheesePizza cut...");
    }

    @Override
    public void box() {
        System.out.println("NYStyleCheesePizza box...");
    }
}
