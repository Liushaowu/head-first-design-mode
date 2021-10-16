package com.design.mode.observer.custom;

/**
 * @author DavidLiu
 */
public interface ObServer {
    /**
     * 更新
     * @param temp temp
     * @param humidity humidity
     * @param pressure pressure
     */
    void update(float temp,float humidity,float pressure);
}
