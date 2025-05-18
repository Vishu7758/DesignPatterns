package com.designpatterns.behavioural.command;

public class FanCommands {
    private FanCommands() {
    }

    public static class FanOnCommand implements Command {
        private final Fan fan;

        public FanOnCommand(Fan fan) {
            this.fan = fan;
        }

        @Override
        public void execute() {
            fan.turnOn();
        }

        @Override
        public void undo() {
            fan.turnOff();
        }
    }

    public static class FanOffCommand implements Command {
        private final Fan fan;

        public FanOffCommand(Fan fan) {
            this.fan = fan;
        }

        @Override
        public void execute() {
            fan.turnOff();
        }

        @Override
        public void undo() {
            fan.turnOn();
        }
    }
}
