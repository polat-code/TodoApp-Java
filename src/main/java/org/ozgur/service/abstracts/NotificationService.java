package org.ozgur.service.abstracts;

import org.ozgur.model.Todo;

public interface NotificationService {

    void sendNotification(Todo todo);
}
