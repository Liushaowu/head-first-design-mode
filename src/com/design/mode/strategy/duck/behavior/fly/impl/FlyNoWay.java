package com.design.mode.strategy.duck.behavior.fly.impl;

import com.design.mode.strategy.duck.behavior.fly.FlyBehavior;

/**
 * @author DavidLiu
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't flying!!");
    }
}
