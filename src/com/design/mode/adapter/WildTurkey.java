package com.design.mode.adapter;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 18:04
 * @description 火鸡
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }

}
