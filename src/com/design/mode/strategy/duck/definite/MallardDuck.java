package com.design.mode.strategy.duck.definite;

import com.design.mode.strategy.duck.Duck;
import com.design.mode.strategy.duck.behavior.fly.impl.FlyWithWings;
import com.design.mode.strategy.duck.behavior.quack.impl.Quack;

/**
 * @author DavidLiu
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard duck!!!");
    }
}
