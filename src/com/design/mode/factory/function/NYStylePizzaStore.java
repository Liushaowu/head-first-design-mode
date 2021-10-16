package com.design.mode.factory.function;

import com.design.mode.factory.entity.*;
import com.design.mode.factory.entity.function.NYStyleCheesePizza;
import com.design.mode.factory.entity.function.NYStyleClamPizza;
import com.design.mode.factory.entity.function.NYStylePepperoniPizza;
import com.design.mode.factory.entity.function.NYStyleVeggiePizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:28
 * @description 简单的披萨工厂
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new NYStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            return new NYStyleClamPizza();
        } else if ("veggie".equals(type)) {
            return new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
