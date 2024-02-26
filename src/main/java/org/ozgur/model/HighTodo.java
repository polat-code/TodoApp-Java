package org.ozgur.model;

import java.util.Date;

public class HighTodo extends Todo{

    private String color;

    public HighTodo() {
    }

    public HighTodo(Long id, String title, String description, Status status, Date createdAt, Date updatedAt) {
        super(id, title, description, status, createdAt, updatedAt);
        this.color = "RED";
    }
    public String getColor() {
        return color;
    }
}
