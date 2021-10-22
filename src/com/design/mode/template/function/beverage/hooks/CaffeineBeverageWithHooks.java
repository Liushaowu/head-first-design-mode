package com.design.mode.template.function.beverage.hooks;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 15:36
 * @description 咖啡因饮料
 */
public abstract class CaffeineBeverageWithHooks {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("boil water");
    }

    protected void pourInCup() {
        System.out.println("pour in cup");
    }

    // hooks
    boolean customerWantsCondiments() {
        return true;
    }
}
