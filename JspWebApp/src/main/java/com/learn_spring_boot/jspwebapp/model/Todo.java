package com.learn_spring_boot.jspwebapp.model;


import java.time.LocalDate;

public class Todo {
    private int id;
    private String username;
    private String description;
    private LocalDate target;
    private boolean done;

    public Todo() {
    }

    public Todo(int id, String username, String description, LocalDate target, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.target = target;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTarget() {
        return target;
    }

    public void setTarget(LocalDate target) {
        this.target = target;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", target=" + target +
                ", done=" + done +
                '}';
    }
}
