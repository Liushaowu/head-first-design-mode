package com.design.mode.template.function;

import com.design.mode.template.function.beverage.Coffee;
import com.design.mode.template.function.beverage.Tea;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 15:42
 * @description 模板方法
 */
public class TemplateFunctionTest {
    public static void main(String[] args) {
        System.out.println("======== Tea ========");
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println("\n======== Coffee ========\n");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
