package com.design.mode.decorate.drinks.coffee;

import com.design.mode.decorate.drinks.Beverage;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 14:51
 * @description 独家咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
