package org.ozgur.service.concretes;

import org.ozgur.model.Todo;
import org.ozgur.service.abstracts.NotificationService;

public class SMSNotificationService implements NotificationService {

    @Override
    public void sendNotification(Todo todo) {
        System.out.println("SMS Notification : " + "Title: " + todo.getTitle() + " Description: " + todo.getDescription());
    }
}
