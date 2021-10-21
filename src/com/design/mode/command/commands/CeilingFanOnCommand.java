package com.design.mode.command.commands;

import com.design.mode.command.device.CeilingFan;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:59
 * @description 打开吊扇
 */
public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
ceilingFan.off();
    }
}
