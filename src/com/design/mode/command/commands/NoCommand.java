package com.design.mode.command.commands;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:28
 * @description 没有命令
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no command");
    }

    @Override
    public void undo() {
        System.out.println("no undo");
    }
}
