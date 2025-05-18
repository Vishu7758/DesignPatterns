package com.designpatterns.behavioural.observer;

public class ObserverMain {
    public static void main(String[] ignoredArgs) {
        // Create a subject
        Publisher publisher = new Publisher();

        // Create observers
        SubscriberA subscriberA = new SubscriberA();
        SubscriberB subscriberB = new SubscriberB();

        // Attach observers to the subject
        publisher.attach(subscriberA);
        publisher.attach(subscriberB);

        // Set the state of the subject
        publisher.setState("New State 1");

        // Detach an observer
        publisher.detach(subscriberB);

        // Set the state of the subject again
        publisher.setState("New State 2");

        // Print the state of the observers
        System.out.println("Subscriber A state: " + subscriberA.getState());
        System.out.println("Subscriber B state: " + subscriberB.getState());
    }
}
