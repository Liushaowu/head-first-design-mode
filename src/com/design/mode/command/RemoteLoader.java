package com.design.mode.command;

import com.design.mode.command.commands.*;
import com.design.mode.command.device.CeilingFan;
import com.design.mode.command.device.GarageDoor;
import com.design.mode.command.device.Light;
import com.design.mode.command.device.Stereo;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/21 15:03
 * @description 远程控制
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");


        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        //状态撤销
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        remoteControl.setCommand(5, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(6, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(7, ceilingFanLow, ceilingFanOff);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);
        remoteControl.onButtonWasPushed(7);
        remoteControl.offButtonWasPushed(7);

        //宏命令
        Command[] macroOn = {livingRoomLightOn, kitchenLightOn, ceilingFanOn, stereoOnWithCD};
        Command[] macroOff = {livingRoomLightOff, kitchenLightOff, ceilingFanOff, stereoOff};
        MacroCommand macroOnCommand = new MacroCommand(macroOn);
        MacroCommand macroOffCommand = new MacroCommand(macroOff);
        remoteControl.setCommand(8, macroOnCommand, macroOffCommand);
        remoteControl.onButtonWasPushed(8);
        remoteControl.offButtonWasPushed(8);
    }
}
