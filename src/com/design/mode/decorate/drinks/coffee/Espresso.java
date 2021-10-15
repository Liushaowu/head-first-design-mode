package com.design.mode.decorate.drinks.coffee;

import com.design.mode.decorate.drinks.Beverage;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 14:50
 * @description 浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
