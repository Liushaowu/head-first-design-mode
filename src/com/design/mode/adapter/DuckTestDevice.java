package com.design.mode.adapter;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 18:07
 * @description 鸭子测试
 */
public class DuckTestDevice {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey Says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck Says...");
        mallardDuck.quick();
        mallardDuck.fly();

        System.out.println("\nThe TurkeyAdapter Says...");
        turkeyAdapter.quick();
        turkeyAdapter.fly();
    }

}
