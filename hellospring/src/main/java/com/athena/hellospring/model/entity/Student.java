package com.athena.hellospring.model.entity;

//import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

//@Entity
public class Student {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String className;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Student() {
    }

    public Student(int id, String name, LocalDate dateOfBirth, String className, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
