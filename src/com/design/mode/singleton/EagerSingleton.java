package com.design.mode.singleton;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 11:55
 * @description 饿汉式 未被使用前就已经将类加载进入内存 造成空间浪费
 */
public class EagerSingleton {
    private static EagerSingleton uniqueSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return uniqueSingleton;
    }
}
