package com.design.mode.factory.entity.simple;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:38
 * @description 蔬菜披萨
 */
public class VeggiePizza extends Pizza {
    @Override
    public  void prepare() {
        System.out.println("VeggiePizza prepare...");
    }

    @Override
    public  void bake() {
        System.out.println("VeggiePizza bake...");
    }

    @Override
    public  void cut() {
        System.out.println("VeggiePizza cut...");
    }

    @Override
    public void box() {
        System.out.println("VeggiePizza box...");
    }
}
