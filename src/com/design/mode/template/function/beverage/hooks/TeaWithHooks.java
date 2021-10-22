package com.design.mode.template.function.beverage.hooks;

import java.util.Scanner;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 15:40
 * @description 茶
 */
public class TeaWithHooks extends CaffeineBeverageWithHooks {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Ading Lemon");
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
        System.out.println("Would you like Lemon with your tea (y/n)? ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
