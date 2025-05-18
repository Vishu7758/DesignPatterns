package com.designpatterns.behavioural.command;

public class RemoteControl {
    private Command lightOnCommand;
    private Command lightOffCommand;
    private Command fanOnCommand;
    private Command fanOffCommand;
    private Command lastCommand;

    public void setLightOnCommand(Command command) {
        this.lightOnCommand = command;
    }

    public void setLightOffCommand(Command command) {
        this.lightOffCommand = command;
    }

    public void setFanOnCommand(Command command) {
        this.fanOnCommand = command;
    }

    public void setFanOffCommand(Command command) {
        this.fanOffCommand = command;
    }

    public void pressLightOnButton() {
        if (lightOnCommand != null) {
            lightOnCommand.execute();
            lastCommand = lightOnCommand; // Store the last command
        }
    }

    public void pressLightOffButton() {
        if (lightOffCommand != null) {
            lightOffCommand.execute();
            lastCommand = lightOffCommand; // Store the last command
        }
    }

    public void pressFanOnButton() {
        if (fanOnCommand != null) {
            fanOnCommand.execute();
            lastCommand = fanOnCommand; // Store the last command
        }
    }

    public void pressFanOffButton() {
        if (fanOffCommand != null) {
            fanOffCommand.execute();
            lastCommand = fanOffCommand; // Store the last command
        }
    }

    public void pressUndoButton() {
        if (lastCommand != null) {
            lastCommand.undo();
            lastCommand = null; // Clear the last command after undo
        }
    }
}
