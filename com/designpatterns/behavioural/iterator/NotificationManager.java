package com.designpatterns.behavioural.iterator;

import java.util.Iterator;

public class NotificationManager {
    private final NotificationCollection emailNotifications;
    private final NotificationCollection pushNotifications;
    private final NotificationCollection smsNotifications;

    public NotificationManager() {
        this.emailNotifications = new EmailNotification();
        this.pushNotifications = new PushNotification();
        this.smsNotifications = new SMSNotification();
    }

    public void addEmailNotification(Notification notification) {
        ((EmailNotification) emailNotifications).addNotification(notification);
    }

    public void addPushNotification(Notification notification) {
        ((PushNotification) pushNotifications).addNotification(notification);
    }

    public void addSMSNotification(Notification notification) {
        ((SMSNotification) smsNotifications).addNotification(notification);
    }

    public void printAllNotifications() {
        Iterator<Notification> emailIterator = emailNotifications.createIterator();
        Iterator<Notification> pushIterator = pushNotifications.createIterator();
        Iterator<Notification> smsIterator = smsNotifications.createIterator();

        printNotification(emailIterator, "Email");
        printNotification(pushIterator, "Push");
        printNotification(smsIterator, "SMS");
    }

    private void printNotification(Iterator<Notification> iterator, String type) {
        System.out.println("Notification Type: " + type);
        while (iterator.hasNext()) {
            Notification notification = iterator.next();
            System.out.println(notification);
        }
    }
}
