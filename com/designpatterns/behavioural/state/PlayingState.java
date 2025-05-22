package com.designpatterns.behavioural.state;

public class PlayingState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Playback is already playing");
    }

    @Override
    public void pressPause() {
        System.out.println("Pausing playback");
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping Playback");
    }

    @Override
    public void display() {
        System.out.println("Current State: Playing");
    }
}
