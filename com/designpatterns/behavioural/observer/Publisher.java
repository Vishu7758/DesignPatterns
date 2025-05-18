package com.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {
    private final List<Observer> observers;
    private String state;

    public Publisher() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getState());
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
