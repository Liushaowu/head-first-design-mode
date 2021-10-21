package com.design.mode.command.commands;

import com.design.mode.command.device.Stereo;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 14:44
 * @description 打开音响并且播放音乐
 */
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
