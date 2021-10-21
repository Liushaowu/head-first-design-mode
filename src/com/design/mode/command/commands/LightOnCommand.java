package com.design.mode.command.commands;

import com.design.mode.command.device.Light;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:49
 * @description 开灯命令
 */
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
