package com.designpatterns.behavioural.state;

public class PausedState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Resuming playback");
    }

    @Override
    public void pressPause() {
        System.out.println("Playback is already paused");
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping Playback");
    }

    @Override
    public void display() {
        System.out.println("Current State: Paused");
    }
}
