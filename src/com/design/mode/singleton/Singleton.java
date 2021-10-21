package com.design.mode.singleton;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 11:41
 * @description 懒加载 单例模式
 * 这种实现方式 多线程时 会创建多个 实例 在
 */
public class Singleton {
    private static Singleton uniqueSingleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        //当两条线程同时执行到这里的时候 这时的 uniqueSingleton 都为 null 所以 会创建多个实例
        if (uniqueSingleton == null) {
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }
}