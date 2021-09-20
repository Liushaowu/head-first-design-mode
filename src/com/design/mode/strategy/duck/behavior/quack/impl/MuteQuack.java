package com.design.mode.strategy.duck.behavior.quack.impl;

import com.design.mode.strategy.duck.behavior.quack.QuackBehavior;

/**
 * @author DavidLiu
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
