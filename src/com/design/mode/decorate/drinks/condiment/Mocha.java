package com.design.mode.decorate.drinks.condiment;

import com.design.mode.decorate.drinks.Beverage;
import com.design.mode.decorate.drinks.Condiment;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 15:09
 * @description 摩卡
 */
public class Mocha extends Condiment {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
