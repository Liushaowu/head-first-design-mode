package com.design.mode.command.device;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:48
 * @description 灯光
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " light on");
    }

    public void off() {
        System.out.println(name + " light off");
    }
}
