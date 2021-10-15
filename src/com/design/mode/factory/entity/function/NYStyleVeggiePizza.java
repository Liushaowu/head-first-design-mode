package com.design.mode.factory.entity.function;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:38
 * @description 蔬菜披萨
 */
public class NYStyleVeggiePizza extends Pizza {
    @Override
    public  void prepare() {
        System.out.println("NYStyleVeggiePizza prepare...");
    }

    @Override
    public  void bake() {
        System.out.println("NYStyleVeggiePizza bake...");
    }

    @Override
    public  void cut() {
        System.out.println("NYStyleVeggiePizza cut...");
    }

    @Override
    public void box() {
        System.out.println("NYStyleVeggiePizza box...");
    }
}
