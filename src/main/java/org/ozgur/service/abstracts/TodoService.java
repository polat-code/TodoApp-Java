package org.ozgur.service.abstracts;

import org.ozgur.model.Todo;
import org.ozgur.service.abstracts.NotificationService;

import java.util.List;

public interface TodoService {

    void createTodo(Todo todo);
    List<Todo> getAllTodos();

    Todo getTodoById(Long id);

    List<Todo> getAllTodosByPriority(String priority);

    List<List<Todo>> categorizeAllTodosByPriority();

    void sendNotification(Todo todo, NotificationService notificationService);

    void updateTodoById(Long id, Todo todo);

    void deleteTodoById(Long id);


}
