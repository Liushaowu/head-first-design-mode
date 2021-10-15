package com.design.mode.decorate.drinks;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 14:45
 * @description 饮料
 */
public abstract class Beverage {

   protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
