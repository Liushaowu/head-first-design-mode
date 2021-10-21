package com.design.mode.command;

import com.design.mode.command.commands.Command;
import com.design.mode.command.commands.NoCommand;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:30
 * @description 遥控器
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[10];
        this.offCommands = new Command[10];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 10; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }


    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n======= Remote Control =======\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("  ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return sb.toString();
    }
}
