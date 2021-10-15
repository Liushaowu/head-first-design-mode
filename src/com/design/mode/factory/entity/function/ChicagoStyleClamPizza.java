package com.design.mode.factory.entity.function;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:37
 * @description 蛤蜊披萨
 */
public class ChicagoStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoStyleClamPizza prepare...");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleClamPizza bake...");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStyleClamPizza cut...");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleClamPizza box...");
    }
}
