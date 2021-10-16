package com.design.mode.factory.abs.store;

import com.design.mode.factory.abs.ingredient.PizzaIngredientFactory;
import com.design.mode.factory.abs.ingredient.impl.NYIngredientFactory;
import com.design.mode.factory.common.Constant;
import com.design.mode.factory.entity.Pizza;
import com.design.mode.factory.entity.abs.CheesePizza;
import com.design.mode.factory.entity.abs.ClamPizza;
import com.design.mode.factory.entity.abs.PepperoniPizza;
import com.design.mode.factory.entity.abs.VeggiePizza;


/**
 * @author David Liu
 * New York 披萨店
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();
        if (Constant.CHEESE.equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (Constant.PEPPERONI.equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style pepperoni Pizza");
        } else if (Constant.CLAM.equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style clam Pizza");
        } else if (Constant.VEGGIE.equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style veggie Pizza");
        }
        return pizza;
    }
}
