package com.design.mode.decorate.drinks.condiment;

import com.design.mode.decorate.drinks.Beverage;
import com.design.mode.decorate.drinks.Condiment;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 15:15
 * @description 奶泡
 */
public class Whip extends Condiment {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
