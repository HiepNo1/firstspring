package com.athena.hellospring.service;

import com.athena.hellospring.model.entity.Student;
import com.athena.hellospring.model.request.CreateStudentRequest;
import com.athena.hellospring.model.request.UpdatedStudentRequest;
import com.athena.hellospring.model.response.StudentResponse;
import com.athena.hellospring.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplement implements StudentService, StudentRepository {
    @Override
    public StudentResponse create(CreateStudentRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setDateOfBirth(request.getDateOfBirth());
        student.setClassName(request.getClassName());
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());
        return new StudentResponse(student);
    }

    @Override
    public StudentResponse update(int id, UpdatedStudentRequest request) {
        Student student = students.stream().filter(student1 -> student1.getId() == id).findAny().get();
        student.setName(request.getName());
        student.setDateOfBirth(request.getDateOfBirth());
        student.setClassName(request.getClassName());
        return new StudentResponse(student);
    }

    @Override
    public String delete(int id) {
        Optional<Student> student = students.stream().filter(student1 -> student1.getId() == id).findAny();
        if (student.isPresent()) {
            students.remove(student);
            return "Xóa thành công";
        }
        return "Ko tồn tại student có id " + id;
    }

    @Override
    public StudentResponse getById(int id) {
        Student student = students.stream().filter(student1 -> student1.getId() == id).findAny().get();
        return new StudentResponse(student);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
