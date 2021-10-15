package com.design.mode.factory.entity.abs;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:36
 * @description 芝加哥意大利腊肠披萨
 */
public class ChicagoStylePepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("ChicagoStylePepperoniPizza prepare...");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStylePepperoniPizza bake...");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStylePepperoniPizza cut...");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStylePepperoniPizza box...");
    }
}
