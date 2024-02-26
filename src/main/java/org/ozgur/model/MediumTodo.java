package org.ozgur.model;

import java.util.Date;

public class MediumTodo extends Todo{

    private String color;

    public MediumTodo() {
    }

    public MediumTodo(Long id, String title, String description, Status status, Date createdAt, Date updatedAt) {
        super(id, title, description, status, createdAt, updatedAt);
        this.color = "YELLOW";
    }
}
