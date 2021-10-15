package com.design.mode.factory.entity.abs;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:37
 * @description 纽约蛤蜊披萨
 */
public class NYStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NYStyleClamPizza prepare...");
    }

    @Override
    public void bake() {
        System.out.println("NYStyleClamPizza bake...");
    }

    @Override
    public void cut() {
        System.out.println("NYStyleClamPizza cut...");
    }

    @Override
    public void box() {
        System.out.println("NYStyleClamPizza box...");
    }
}
