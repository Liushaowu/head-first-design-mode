package com.design.mode.factory.simple;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:27
 * @description 披萨商店
 */
public class PizzaStore {
    void orderPizza(String type) {
        Pizza pizza = SimplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
