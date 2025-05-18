package com.designpatterns.behavioural.observer;

/**
 * Subject interface that defines the methods for attaching,
 * detaching, and notifying observers.
 */
public interface Subject {
    /**
     * Attaches an observer to the subject.
     *
     * @param observer the observer to attach
     */
    void attach(Observer observer);

    /**
     * Detaches an observer from the subject.
     *
     * @param observer the observer to detach
     */
    void detach(Observer observer);

    /**
     * Notifies all attached observers of a change in state.
     */
    void notifyObservers();
}
