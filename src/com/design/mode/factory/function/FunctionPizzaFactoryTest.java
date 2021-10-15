package com.design.mode.factory.function;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:56
 * @description 简单披萨工厂测试
 */
public class FunctionPizzaFactoryTest {

    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("cheese");
        nyStylePizzaStore.orderPizza("pepperoni");
        nyStylePizzaStore.orderPizza("clam");
        nyStylePizzaStore.orderPizza("veggie");
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza("cheese");
        chicagoStylePizzaStore.orderPizza("pepperoni");
        chicagoStylePizzaStore.orderPizza("clam");
        chicagoStylePizzaStore.orderPizza("veggie");


    }
}
