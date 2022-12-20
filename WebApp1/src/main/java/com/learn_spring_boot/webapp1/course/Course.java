package com.learn_spring_boot.webapp1.course;

import java.math.BigInteger;

public class Course {
    private BigInteger id;
    private String name;
    private String author;

    public Course(BigInteger id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Course() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            '}';
    }
}
