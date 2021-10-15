package com.design.mode.decorate.drinks.condiment;

import com.design.mode.decorate.drinks.Beverage;
import com.design.mode.decorate.drinks.Condiment;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 15:11
 * @description 牛奶
 */
public class Milk extends Condiment {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + "，Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
