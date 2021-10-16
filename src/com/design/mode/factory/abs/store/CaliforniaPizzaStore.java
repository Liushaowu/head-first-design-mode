package com.design.mode.factory.abs.store;

import com.design.mode.factory.abs.ingredient.PizzaIngredientFactory;
import com.design.mode.factory.abs.ingredient.impl.CaliforniaIngredientFactory;
import com.design.mode.factory.abs.ingredient.impl.NYIngredientFactory;
import com.design.mode.factory.common.Constant;
import com.design.mode.factory.entity.Pizza;
import com.design.mode.factory.entity.abs.CheesePizza;
import com.design.mode.factory.entity.abs.ClamPizza;
import com.design.mode.factory.entity.abs.PepperoniPizza;
import com.design.mode.factory.entity.abs.VeggiePizza;


/**
 * @author David Liu
 * New York 加州披萨店
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaIngredientFactory();
        if (Constant.CHEESE.equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("California Style Cheese Pizza");
        } else if (Constant.PEPPERONI.equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("California Style pepperoni Pizza");
        } else if (Constant.CLAM.equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("California Style clam Pizza");
        } else if (Constant.VEGGIE.equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("California Style veggie Pizza");
        }
        return pizza;
    }
}
