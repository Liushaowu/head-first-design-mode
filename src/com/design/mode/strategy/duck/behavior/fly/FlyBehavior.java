package com.design.mode.strategy.duck.behavior.fly;

/**
 * @author DavidLiu
 * 抽象出来的 飞行 行为 的接口
 * Duck 由不同的飞行方式 如果发现新的飞行方式 则 新建一个实现类来实现该行为 来拓展
 */
public interface FlyBehavior {
    /**
     * 飞行
     */
    void fly();
}
