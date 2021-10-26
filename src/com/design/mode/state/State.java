package com.design.mode.state;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 17:04
 * @description 状态
 */
public interface State {
    /**
     * 投币
     **/
    void insertQuarter();

    /**
     * 退币
     **/
    void ejectQuarter();

    /**
     * 转动曲柄曲柄
     **/
    void turnCrank();

    /**
     * 发放糖果
     **/
    void dispense();
}
