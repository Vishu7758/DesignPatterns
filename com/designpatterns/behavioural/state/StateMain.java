package com.designpatterns.behavioural.state;

public class StateMain {
    public static void main(String[] ignoredArgs) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.displayState(); // Current State: Playing
        mediaPlayer.play(); // Playback is already playing
        mediaPlayer.pause(); // Pausing playback

        mediaPlayer.setState(new StoppedState());
        mediaPlayer.stop(); // Stopping Playback
        mediaPlayer.displayState(); // Current State: Stopped

        mediaPlayer.setState(new PausedState());
        mediaPlayer.pause(); // Playback is already paused
        mediaPlayer.displayState(); // Current State: Paused
    }
}
