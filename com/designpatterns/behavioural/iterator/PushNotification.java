package com.designpatterns.behavioural.iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PushNotification implements NotificationCollection {
    private final Set<Notification> pushNotifications;

    public PushNotification() {
        this.pushNotifications = new LinkedHashSet<>();
    }

    public void addNotification(Notification notification) {
        pushNotifications.add(notification);
    }
    
    @Override
    public Iterator<Notification> createIterator() {
        return new PushNotificationIterator(pushNotifications);
    }

    private static class PushNotificationIterator implements Iterator<Notification> {
        private final Iterator<Notification> iterator;

        public PushNotificationIterator(Set<Notification> notifications) {
            this.iterator = notifications.iterator();
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public Notification next() {
            return iterator.next();
        }
    }
}
