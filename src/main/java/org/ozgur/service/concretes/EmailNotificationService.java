package org.ozgur.service.concretes;

import org.ozgur.model.Todo;
import org.ozgur.service.abstracts.NotificationService;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(Todo todo) {
        System.out.println("Email Notification : " + "Title: " + todo.getTitle() + " Description: " + todo.getDescription());
    }
}
