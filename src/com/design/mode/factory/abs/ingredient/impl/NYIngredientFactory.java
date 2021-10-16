package com.design.mode.factory.abs.ingredient.impl;

import com.design.mode.factory.abs.ingredient.PizzaIngredientFactory;
import com.design.mode.factory.entity.abs.ingredient.*;
import com.design.mode.factory.entity.abs.ingredient.impl.*;


/**
 * @author DavidLiu
 * 纽约原料加工厂
 */
public class NYIngredientFactory implements PizzaIngredientFactory {
    /**
     * 创建芝士
     *
     * @return Cheese
     */
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    /**
     * 创建蛤蜊
     *
     * @return Clams
     */
    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    /**
     * 创建面团
     *
     * @return Dough
     */
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    /**
     * 创建香肠
     *
     * @return Pepperoni
     */
    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    /**
     * 创建酱汁
     *
     * @return Sauce
     */
    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    /**
     * 创建蔬菜
     *
     * @return Veggies
     */
    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Mushroom(), new RedPepper(), new Onion()};
    }
}
