package com.design.mode.strategy.duck.behavior.fly.impl;

import com.design.mode.strategy.duck.behavior.fly.FlyBehavior;

/**
 * @author DavidLiu
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
