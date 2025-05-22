package com.designpatterns.behavioural.state;

public class StoppedState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Starting playback");
    }

    @Override
    public void pressPause() {
        System.out.println("Playback is already stopped");
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping Playback");
    }

    @Override
    public void display() {
        System.out.println("Current State: Stopped");
    }
}
