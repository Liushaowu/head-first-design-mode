package com.design.mode.factory.simple;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:56
 * @description 简单披萨工厂测试
 */
public class SimplePizzaFactoryTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("pepperoni");
        pizzaStore.orderPizza("clam");
        pizzaStore.orderPizza("veggie");
    }
}
