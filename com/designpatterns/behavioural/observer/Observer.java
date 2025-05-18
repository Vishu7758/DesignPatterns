package com.designpatterns.behavioural.observer;

/**
 * Observer interface that defines the method for updating
 * the observer when the subject's state changes.
 */
public interface Observer {
    /**
     * Updates the observer with the new state of the subject.
     *
     * @param state the new state of the subject
     */
    void update(String state);
}
