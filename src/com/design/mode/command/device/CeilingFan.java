package com.design.mode.command.device;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:58
 * @description 吊扇
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String name;
    int speed;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " ceiling fan on");
    }

    public void off() {
        speed = OFF;
        System.out.println(name + " ceiling fan off");
    }

    public void high() {
        speed = HIGH;
        System.out.println("ceiling fan high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("ceiling fan medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("ceiling fan low");
    }

    public int getSpeed() {
        return speed;
    }

}
