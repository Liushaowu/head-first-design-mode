package com.design.mode.strategy.duck.behavior.quack;

/**
 * @author DavidLiu
 * 抽象出来的 鸭子叫 行为 的接口
 * Duck 由不同的 叫声 如果发现新的叫声 则 新建一个实现类来实现该叫声 来拓展
 */
public interface QuackBehavior {
    /**
     * 鸭子叫
     */
    void quack();
}
