package com.design.mode.command.commands;

import com.design.mode.command.device.GarageDoor;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:56
 * @description 车库门上升
 */
public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
        garageDoor.stop();
    }

    @Override
    public void undo() {
        garageDoor.down();
        garageDoor.lightOff();
        garageDoor.stop();
    }
}
