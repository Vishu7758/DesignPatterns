package com.designpatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmailNotification implements NotificationCollection {
    private final List<Notification> emailNotifications;

    public EmailNotification() {
        this.emailNotifications = new ArrayList<>();
    }

    public void addNotification(Notification notification) {
        emailNotifications.add(notification);
    }
    
    @Override
    public Iterator<Notification> createIterator() {
        return new EmailNotificationIterator(emailNotifications);
    }

    private static class EmailNotificationIterator implements Iterator<Notification> {
        private final List<Notification> notifications;
        private int index;

        public EmailNotificationIterator(List<Notification> notifications) {
            this.index = 0;
            this.notifications = new ArrayList<>(notifications); // Copy for safe iteration
        }

        @Override
        public boolean hasNext() {
            return index < notifications.size();
        }

        @Override
        public Notification next() {
            return notifications.get(index++);
        }
    }
}
