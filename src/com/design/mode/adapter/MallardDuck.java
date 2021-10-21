package com.design.mode.adapter;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 18:02
 * @description 绿头鸭
 */
public class MallardDuck implements Duck {
    @Override
    public void quick() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("fly!");
    }
}
