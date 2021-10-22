package com.design.mode.template.function;

import com.design.mode.template.function.beverage.hooks.CoffeeWithHooks;
import com.design.mode.template.function.beverage.hooks.TeaWithHooks;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 15:42
 * @description 模板方法
 */
public class TemplateFunctionHooksTest {
    public static void main(String[] args) {
        System.out.println("======== Tea ========");
        TeaWithHooks tea = new TeaWithHooks();
        tea.prepareRecipe();
        System.out.println("\n======== Coffee ========\n");
        CoffeeWithHooks coffee = new CoffeeWithHooks();
        coffee.prepareRecipe();
    }
}
