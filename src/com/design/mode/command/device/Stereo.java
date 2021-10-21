package com.design.mode.command.device;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:40
 * @description 音响
 */
public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Stereo on");
    }

    public void off() {
        System.out.println(name + " Stereo off");
    }

    public void setCD() {
        System.out.println(name + " Stereo load cd");
    }

    public void setDVD() {
        System.out.println(name + " Stereo load DVD");
    }

    public void setRadio() {
        System.out.println(name + " Stereo load radio");
    }

    public void setVolume(Integer volume) {
        System.out.println(name + " Stereo set volume：" + volume);
    }

}
