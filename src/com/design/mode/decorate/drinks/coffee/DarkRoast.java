package com.design.mode.decorate.drinks.coffee;

import com.design.mode.decorate.drinks.Beverage;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 14:53
 * @description 深焙咖啡
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
