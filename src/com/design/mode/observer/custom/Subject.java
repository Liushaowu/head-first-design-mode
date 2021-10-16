package com.design.mode.observer.custom;

/**
 * @author DavidLiu
 */
public interface Subject {
    /**
     * 注册 Observer
     * @param obServer obServer
     */
    void registerObserver(ObServer obServer);
    /**
     * 删除 Observer
     * @param obServer obServer
     */
    void removeObserver(ObServer obServer);
    /**
     * 通知所有观察者
     */
    void notifyObserver();
}
