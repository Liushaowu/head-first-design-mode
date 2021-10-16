package com.design.mode.factory.simple;

import com.design.mode.factory.common.Constant;
import com.design.mode.factory.entity.*;
import com.design.mode.factory.entity.simple.CheesePizza;
import com.design.mode.factory.entity.simple.ClamPizza;
import com.design.mode.factory.entity.simple.PepperoniPizza;
import com.design.mode.factory.entity.simple.VeggiePizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:28
 * @description 简单的披萨工厂
 */
public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (Constant.CHEESE.equals(type)) {
            return new CheesePizza();
        } else if (Constant.PEPPERONI.equals(type)) {
            return new PepperoniPizza();
        } else if (Constant.CLAM.equals(type)) {
            return new ClamPizza();
        } else if (Constant.VEGGIE.equals(type)) {
            return new VeggiePizza();
        }
        return pizza;
    }
}
