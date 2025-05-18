package com.designpatterns.behavioural.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager();

        notificationManager.addEmailNotification(new Notification("Email Notification 1"));
        notificationManager.addEmailNotification(new Notification("Email Notification 2"));

        notificationManager.addPushNotification(new Notification("Push Notification 1"));
        notificationManager.addPushNotification(new Notification("Push Notification 2"));

        notificationManager.addSMSNotification(new Notification("SMS Notification 1"));
        notificationManager.addSMSNotification(new Notification("SMS Notification 2"));

        notificationManager.printAllNotifications();
    }
}
