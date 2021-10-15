package com.design.mode.factory.entity.simple;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:34
 * @description 芝士披萨
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("CheesePizza prepare...");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza bake...");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza cut...");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza box...");
    }
}
