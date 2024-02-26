package org.ozgur.service.concretes;

import org.ozgur.model.Todo;
import org.ozgur.repository.TodoRepository;
import org.ozgur.service.abstracts.NotificationService;
import org.ozgur.service.abstracts.TodoService;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
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
        return todoRepository.categorizeAllTodosByPriority();
    }

    @Override
    public void sendNotification(Todo todo, NotificationService notificationService) {
        try{
            notificationService.sendNotification(todo);
        }catch (Exception e) {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public void updateTodoById(Long id, Todo newVersionTodo) {
        try {
            Todo updatedTodo = todoRepository.getTodoById(id);
            updatedTodo.setTitle(newVersionTodo.getTitle());
            updatedTodo.setDescription(newVersionTodo.getDescription());
            updatedTodo.setUpdatedAt(new Date());
            updatedTodo.setStatus(newVersionTodo.getStatus());
        }catch (Exception e) {
            System.out.println("Illegal Todo id in updateTodoById() method");
        }

    }

    @Override
    public void deleteTodoById(Long id) {
        try {
            Todo todo = getTodoById(id);
            todoRepository.getAllTodos().remove(todo);
        }catch (Exception e) {
            System.out.println("Illegal Todo id in deleteTodoById() method");
        }

    }
}
