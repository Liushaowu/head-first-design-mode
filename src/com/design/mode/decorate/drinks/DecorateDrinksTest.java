package com.design.mode.decorate.drinks;

import com.design.mode.decorate.drinks.coffee.DarkRoast;
import com.design.mode.decorate.drinks.coffee.Espresso;
import com.design.mode.decorate.drinks.coffee.HouseBlend;
import com.design.mode.decorate.drinks.condiment.Mocha;
import com.design.mode.decorate.drinks.condiment.Soy;
import com.design.mode.decorate.drinks.condiment.Whip;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 15:18
 * @description 测试
 */
public class DecorateDrinksTest {
    public static void main(String[] args) {
        //定一杯 浓缩咖啡 不需要调料
        Beverage espresso = new Espresso();
        print(espresso);
        //定一杯深焙咖啡
        Beverage darkRoast = new DarkRoast();
        //加一个摩卡
        darkRoast = new Mocha(darkRoast);
        print(darkRoast);
        //双倍摩卡
        darkRoast = new Mocha(darkRoast);
        print(darkRoast);
        //加奶泡双倍摩卡
        darkRoast = new Whip(darkRoast);
        print(darkRoast);

        Beverage houseBlend = new HouseBlend();//一杯 独家咖啡
        houseBlend = new Soy(houseBlend);//加豆浆
        houseBlend = new Mocha(houseBlend);//加摩卡
        houseBlend = new Whip(houseBlend);//加奶泡
        print(houseBlend);

    }

    /**
     * 打印
     **/
    private static void print(Beverage beverage) {

        System.out.println(beverage.getDescription() + ": " + beverage.cost());
    }
}
