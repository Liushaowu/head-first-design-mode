package com.design.mode.template.function.beverage.hooks;

import java.util.Scanner;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 15:41
 * @description 咖啡
 */
public class CoffeeWithHooks extends CaffeineBeverageWithHooks {
    @Override
    protected void brew() {
        System.out.println("dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
    //覆盖钩子函数
    @Override
    boolean customerWantsCondiments() {
        String next = getInput();
        if (next.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getInput() {
        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
