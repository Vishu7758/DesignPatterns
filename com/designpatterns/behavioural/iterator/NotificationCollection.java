package com.designpatterns.behavioural.iterator;

import java.util.Iterator;

public interface NotificationCollection {
    public Iterator<Notification> createIterator();
}
