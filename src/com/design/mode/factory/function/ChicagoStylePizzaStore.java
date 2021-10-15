package com.design.mode.factory.function;

import com.design.mode.factory.entity.Pizza;
import com.design.mode.factory.entity.function.*;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 17:10
 * @description 芝加哥披萨商店
 */
public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new ChicagoStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            return new ChicagoStyleClamPizza();
        } else if ("veggie".equals(type)) {
            return new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
