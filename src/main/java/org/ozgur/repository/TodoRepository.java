package org.ozgur.repository;

import org.ozgur.databaase.Database;
import org.ozgur.model.HighTodo;
import org.ozgur.model.LowTodo;
import org.ozgur.model.MediumTodo;
import org.ozgur.model.Todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TodoRepository {

    private final Database database;
    private final List<Todo> todoList;

    public TodoRepository(Database database) {
        this.database = database;
        this.todoList = this.database.getAllTodos();

    }

    public List<Todo> getAllTodos(){
        return todoList;
    }


    public void addTodo(Todo todo) {
        todoList.add(todo);
    }

    public Todo getTodoById(Long id) {
        Todo foundTodo = null;

        for(Todo todo : this.todoList) {
            if(todo.getId().equals(id)){
                foundTodo = todo;
            }
        }
        if(foundTodo == null) {
            throw new IllegalArgumentException();
        }
        return foundTodo;

    }

    public List<Todo> getAllTodosByPriority(String priority ) {
        List<Todo> filteredTodo = new LinkedList<>();
        if(priority.toLowerCase().equals("low")){
            filterLowTodo(filteredTodo);
        }else if (priority.toLowerCase().equals("medium")){
            filterMediumTodo(filteredTodo);
        }else if(priority.toLowerCase().equals("high")){
            filterHighTodo( filteredTodo);
        }else {
            throw new IllegalArgumentException();
        }
        return filteredTodo;
    }

    private void filterHighTodo(List<Todo> filteredTodo) {
        for(Todo todo : this.todoList) {
            if(todo instanceof HighTodo) {
                filteredTodo.add(todo);
            }
        }
    }

    private void filterMediumTodo(List<Todo> filteredTodo) {
        List<Todo> allTodos = this.todoList;
        for(Todo todo : allTodos) {
            if(todo instanceof MediumTodo) {
                filteredTodo.add(todo);
            }
        }

    }

    private void filterLowTodo(List<Todo> filteredTodo) {
        List<Todo> allTodos = this.todoList;

        for(Todo todo : allTodos) {
            if(todo instanceof LowTodo) {
                filteredTodo.add(todo);
            }
        }

    }

    public List<List<Todo>> categorizeAllTodosByPriority() {
        List<Todo> lowTodoList = new ArrayList<>();
        filterLowTodo(lowTodoList);
        List<Todo> mediumTodoList = new ArrayList<>();
        filterMediumTodo(mediumTodoList);
        List<Todo> highTodoList = new ArrayList<>();
        filterHighTodo(highTodoList);
        List<List<Todo>> categorizedTodo = Arrays.asList(lowTodoList,mediumTodoList,highTodoList);
        return categorizedTodo;
    }
}
