package com.design.mode.singleton;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 13:28
 * @description 双重检查加锁 性能优异
 */
public class DoubleCheckLockingSingleton {
    private volatile static DoubleCheckLockingSingleton uniqueSingleton;

    private DoubleCheckLockingSingleton() {
    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (uniqueSingleton == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (uniqueSingleton == null) {
                    uniqueSingleton = new DoubleCheckLockingSingleton();
                }
            }
        }
        return uniqueSingleton;
    }
}
