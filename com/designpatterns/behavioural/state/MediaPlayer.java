package com.designpatterns.behavioural.state;

public class MediaPlayer {
    private State currentState;

    public MediaPlayer() {
        currentState = new PlayingState();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void play() {
        currentState.pressPlay();
    }

    public void pause() {
        currentState.pressPause();
    }

    public void stop() {
        currentState.pressStop();
    }

    public void displayState() {
        currentState.display();
    }
}
