package com.design.mode.factory.abs.ingredient;

import com.design.mode.factory.entity.abs.ingredient.*;

/**
 * @author David Liu
 */
public interface PizzaIngredientFactory {
    /**
     * 创建芝士
     *
     * @return Cheese
     */
    Cheese createCheese();

    /**
     * 创建蛤蜊
     *
     * @return Clams
     */
    Clams createClams();

    /**
     * 创建面团
     *
     * @return Dough
     */
    Dough createDough();

    /**
     * 创建香肠
     *
     * @return Pepperoni
     */
    Pepperoni createPepperoni();

    /**
     * 创建酱汁
     *
     * @return Sauce
     */
    Sauce createSauce();

    /**
     * 创建蔬菜
     *
     * @return Veggies
     */
    Veggies[] createVeggies();

}
