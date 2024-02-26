package org.ozgur.service.concretes;

import org.ozgur.model.Todo;
import org.ozgur.repository.TodoRepository;
import org.ozgur.service.abstracts.NotificationService;
import org.ozgur.service.abstracts.TodoService;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @Override
    public void createTodo(Todo todo) {
        todoRepository.addTodo(todo);
    }

    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.getAllTodos();
    }

    @Override
    public Todo getTodoById(Long id) {
        Todo todo = null;
        try{
            todo = todoRepository.getTodoById(id);
        }catch (Exception e){
            System.out.println("There is no such a id :" + id);
        }
        return todo;
    }

    @Override
    public List<Todo> getAllTodosByPriority(String priority) {
        return todoRepository.getAllTodosByPriority(priority);
    }

    @Override
    public List<List<Todo>> categorizeAllTodosByPriority() {
        // [lowTodoList, mediumTodoList, HighTodoList]
        return todoRepository.categorizeAllTodosByPriority();
    }

    @Override
    public void sendNotification(Todo todo, NotificationService notificationService) {

    }

    @Override
    public void updateTodoById(Long id, Todo todo) {

    }

    @Override
    public void deleteTodoById(Long id) {

    }
}
