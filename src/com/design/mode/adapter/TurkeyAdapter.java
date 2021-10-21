package com.design.mode.adapter;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 18:05
 * @description 适配器
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quick() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }

    }
}
