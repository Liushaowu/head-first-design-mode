package com.design.mode.command.device;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:52
 * @description 车库门
 */
public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name+" garage door up");
    }

    public void down() {
        System.out.println(name+" garage door down");
    }

    public void stop() {
        System.out.println(name+" garage door stop");
    }

    public void lightOn() {
        System.out.println(name+" garage door light on");
    }

    public void lightOff() {
        System.out.println(name+" garage door light off");
    }
}
