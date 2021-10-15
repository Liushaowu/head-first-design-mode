package com.design.mode.decorate.drinks.coffee;

import com.design.mode.decorate.drinks.Beverage;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 15:06
 * @description 低卡咖啡
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
