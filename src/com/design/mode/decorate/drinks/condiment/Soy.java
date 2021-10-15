package com.design.mode.decorate.drinks.condiment;

import com.design.mode.decorate.drinks.Beverage;
import com.design.mode.decorate.drinks.Condiment;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 15:13
 * @description 豆浆
 */
public class Soy extends Condiment {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
