package com.designpatterns.behavioural.iterator;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class SMSNotification implements NotificationCollection {
    private final Queue<Notification> smsNotifications;

    public SMSNotification() {
        this.smsNotifications = new ArrayDeque<>();
    }

    public void addNotification(Notification notification) {
        smsNotifications.add(notification);
    }
    
    @Override
    public Iterator<Notification> createIterator() {
        return new SMSNotificationIterator(smsNotifications);
    }

    private record SMSNotificationIterator(Queue<Notification> notifications) implements Iterator<Notification> {
        private SMSNotificationIterator(Queue<Notification> notifications) {
            this.notifications = new ArrayDeque<>(notifications); //copy for safe iteration
        }

        @Override
        public boolean hasNext() {
            return !notifications.isEmpty();
        }

        @Override
        public Notification next() {
            return notifications.poll();
        }
    }
}
