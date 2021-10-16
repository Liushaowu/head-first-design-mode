package com.design.mode.factory.abs;


import com.design.mode.factory.abs.store.CaliforniaPizzaStore;
import com.design.mode.factory.abs.store.ChicagoPizzaStore;
import com.design.mode.factory.abs.store.NYPizzaStore;
import com.design.mode.factory.abs.store.PizzaStore;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:56
 * @description 简单披萨工厂测试
 */
public class AbstractPizzaFactoryTest {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        orderPizza(nyPizzaStore);
        PizzaStore californiaPizzaStore= new CaliforniaPizzaStore();
        orderPizza(californiaPizzaStore);
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        orderPizza(chicagoPizzaStore);
    }

    static void orderPizza(PizzaStore store) {
        store.orderPizza("cheese");
        store.orderPizza("pepperoni");
        store.orderPizza("clam");
        store.orderPizza("veggie");
    }
}
