package com.design.mode.state;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 17:04
 * @description 状态
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
