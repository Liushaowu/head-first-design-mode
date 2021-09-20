package com.design.mode.strategy.duck.definite;

import com.design.mode.strategy.duck.Duck;
import com.design.mode.strategy.duck.behavior.fly.impl.FlyNoWay;
import com.design.mode.strategy.duck.behavior.quack.impl.MuteQuack;

/**
 * @author DavidLiu
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model duck");
    }

}
