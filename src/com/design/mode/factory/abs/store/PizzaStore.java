package com.design.mode.factory.abs.store;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:27
 * @description 披萨商店
 */
public abstract class PizzaStore {
    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza);
    }

    protected abstract Pizza createPizza(String type);
}
