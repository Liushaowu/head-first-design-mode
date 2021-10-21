package com.design.mode.singleton;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 12:00
 * @description 饱汉式 性能差
 */
public class HanSingleton {
    private static HanSingleton uniqueSingleton;

    private HanSingleton() {
    }

    public static synchronized HanSingleton getInstance() {
        if (uniqueSingleton == null) {
            uniqueSingleton = new HanSingleton();
        }
        return uniqueSingleton;
    }
}
