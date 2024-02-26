package org.ozgur.model;

import java.util.Date;

public class LowTodo extends Todo{

    private String color;

    public LowTodo() {
    }

    public LowTodo(Long id, String title, String description, Status status, Date createdAt, Date updatedAt) {
        super(id, title, description, status, createdAt, updatedAt);
        color="BROWN";
    }
}
