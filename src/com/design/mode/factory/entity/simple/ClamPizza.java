package com.design.mode.factory.entity.simple;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:37
 * @description 蛤蜊披萨
 */
public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ClamPizza prepare...");
    }

    @Override
    public void bake() {
        System.out.println("ClamPizza bake...");
    }

    @Override
    public void cut() {
        System.out.println("ClamPizza cut...");
    }

    @Override
    public void box() {
        System.out.println("ClamPizza box...");
    }
}
