package com.design.mode.state;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 17:09
 * @description 赢家
 */
public class WinnerState implements State {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 投币
     **/
    @Override
    public void insertQuarter() {
        System.out.println("Please wait,we're already giving you a gumball");
    }

    /**
     * 退币
     **/
    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    /**
     * 转动曲柄曲柄
     **/
    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    /**
     * 发放糖果
     **/
    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER ! You get tow gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops , out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public String toString() {
        return "WinnerState{}";
    }
}
