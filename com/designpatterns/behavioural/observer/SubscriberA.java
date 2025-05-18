package com.designpatterns.behavioural.observer;

public class SubscriberA implements Observer {
    private String state;

    @Override
    public void update(String state) {
        this.state = state;
        System.out.println("Subscriber A updated with state: " + getState());
    }

    public String getState() {
        return state;
    }
}
