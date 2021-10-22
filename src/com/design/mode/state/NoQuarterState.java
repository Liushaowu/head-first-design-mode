package com.design.mode.state;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 17:08
 * @description
 */
public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cant't insert another quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry , You haven't put in 25 cents yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ....");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
