package com.design.mode.strategy.duck;

import com.design.mode.strategy.duck.behavior.fly.FlyBehavior;
import com.design.mode.strategy.duck.behavior.quack.QuackBehavior;

/**
 * @author DavidLiu
 * 鸭子的抽象类,将飞行和叫声的行为作为属性进行声明,
 * 在具体的飞行和叫声的方法中,来调用行为的飞行和叫声的方法
 * 通过 set方法 可以动态的改变鸭子的声音和飞行方式
 */
public abstract class Duck {
    /**
     * 飞行行为
     */
    protected FlyBehavior flyBehavior;
    /**
     * 叫声行为
     */
    protected QuackBehavior quackBehavior;

    /**
     * 展示
     */
    public abstract void display();

    public void perFromFly() {
        flyBehavior.fly();
    }

    public void perFromQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float , even decoys");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
