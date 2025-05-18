package com.designpatterns.behavioural.command;

public class CommandMain {
    public static void main(String[] ignoredArgs) {
        // Create a remote control
        RemoteControl remote = new RemoteControl();

        // Create devices
        Light light = new Light();
        Fan fan = new Fan();

        // Create commands
        Command lightOnCommand = new LightCommands.LightOnCommand(light);
        Command lightOffCommand = new LightCommands.LightOffCommand(light);
        Command fanOnCommand = new FanCommands.FanOnCommand(fan);
        Command fanOffCommand = new FanCommands.FanOffCommand(fan);

        remote.setLightOnCommand(lightOnCommand);
        remote.setLightOffCommand(lightOffCommand);
        remote.setFanOnCommand(fanOnCommand);
        remote.setFanOffCommand(fanOffCommand);

        // Test the commands
        System.out.println("Testing Light Commands:");
        remote.pressLightOnButton(); // Light is turned on
        remote.pressLightOffButton(); // Light is turned off
        remote.pressUndoButton(); // Light is turned on again
        System.out.println("Testing Fan Commands:");
        remote.pressFanOnButton(); // Fan is turned on
        remote.pressFanOffButton(); // Fan is turned off
        remote.pressUndoButton(); // Fan is turned on again
    }
}
