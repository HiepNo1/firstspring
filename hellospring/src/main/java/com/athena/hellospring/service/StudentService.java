package com.athena.hellospring.service;

import com.athena.hellospring.model.entity.Student;
import com.athena.hellospring.model.request.CreateStudentRequest;
import com.athena.hellospring.model.request.UpdatedStudentRequest;
import com.athena.hellospring.model.response.StudentResponse;

import java.util.List;


public interface StudentService {
    StudentResponse create(CreateStudentRequest request);

    StudentResponse update(int id, UpdatedStudentRequest request);

    String delete(int id);

    StudentResponse getById(int id);

    List<Student> getAll();

}
