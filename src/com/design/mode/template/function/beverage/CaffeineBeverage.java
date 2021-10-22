package com.design.mode.template.function.beverage;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 15:36
 * @description 咖啡因饮料
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("boil water");
    }

    protected void pourInCup() {
        System.out.println("pour in cup");
    }

}
