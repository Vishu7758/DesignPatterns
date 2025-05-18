package com.designpatterns.behavioural.observer;

public class SubscriberB implements Observer {
    private String state;

    @Override
    public void update(String state) {
        this.state = state;
        System.out.println("Subscriber B updated with state: " + getState());
    }

    public String getState() {
        return state;
    }
}
