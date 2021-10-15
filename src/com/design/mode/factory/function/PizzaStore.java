package com.design.mode.factory.function;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:27
 * @description 披萨商店
 */
public abstract class PizzaStore {
    void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    abstract Pizza createPizza(String type);
}
