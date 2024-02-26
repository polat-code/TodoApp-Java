package org.ozgur.service.concretes;

import org.ozgur.model.Todo;
import org.ozgur.service.abstracts.NotificationService;

public class MobileAppNotificationService implements NotificationService {
    @Override
    public void sendNotification(Todo todo) {
        System.out.println("Mobile App Notification : " + "Title: " + todo.getTitle() + " Description: " + todo.getDescription());
    }
}
