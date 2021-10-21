package com.design.mode.command.commands;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:27
 * @description 命令
 */
public interface Command {
    void execute();

    void undo();
}
