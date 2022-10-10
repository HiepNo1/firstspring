package com.athena.hellospring.model.response;

import com.athena.hellospring.model.entity.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StudentResponse {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String className;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

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

    public StudentResponse(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.className = student.getClassName();
        this.dateOfBirth = student.getDateOfBirth();
        this.createdAt = student.getCreatedAt();
        this.updatedAt = student.getUpdatedAt();
    }
}
