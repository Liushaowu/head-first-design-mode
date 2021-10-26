package com.design.mode.state;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 17:07
 * @description
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry,we're out of stock");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,we're out of stock");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry,we're out of stock");
        gumballMachine.ejectQuarter();
    }

    @Override
    public void dispense() {
        System.out.println("Sorry,we're out of stock");
    }

    @Override
    public String toString() {
        return "SoldOutState{}";
    }
}
