package com.design.mode.factory.entity.abs;

import com.design.mode.factory.entity.Pizza;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:38
 * @description 芝加哥蔬菜披萨
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    @Override
    public  void prepare() {
        System.out.println("ChicagoStyleVeggiePizza prepare...");
    }

    @Override
    public  void bake() {
        System.out.println("ChicagoStyleVeggiePizza bake...");
    }

    @Override
    public  void cut() {
        System.out.println("ChicagoStyleVeggiePizza cut...");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleVeggiePizza box...");
    }
}
