package com.design.mode.command.commands;

import com.design.mode.command.device.Light;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:50
 * @description 关灯命令
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
