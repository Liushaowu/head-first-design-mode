package com.design.mode.command.commands;

import com.design.mode.command.device.GarageDoor;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:56
 * @description 车库门上升
 */
public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.lightOff();
        garageDoor.stop();
    }

    @Override
    public void undo() {
        garageDoor.up();
        garageDoor.lightOn();
        garageDoor.stop();
    }
}
