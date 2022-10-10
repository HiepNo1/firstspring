package com.athena.hellospring.controller;

import com.athena.hellospring.model.entity.Student;
import com.athena.hellospring.model.request.CreateStudentRequest;
import com.athena.hellospring.model.request.UpdatedStudentRequest;
import com.athena.hellospring.model.response.StudentResponse;
import com.athena.hellospring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/athena")
public class HelloAthenaController {
    @Autowired
    private StudentService service;

    @GetMapping("/will")
    public String willing() {
        return "Hello Java Spring";
    }

    @GetMapping("/end")
    public String end() {
        return "End";
    }

    @GetMapping("/get")
    public List<Student> get() {
        return service.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<StudentResponse> create(@RequestBody CreateStudentRequest request) {
        StudentResponse response = service.create(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<StudentResponse> update(@PathVariable(name = "id") int id, @RequestBody UpdatedStudentRequest request) {
        StudentResponse response = service.update(id, request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") int id) {
        return ResponseEntity.ok(service.delete(id));
    }

    @GetMapping("/getid/{id}")
    public ResponseEntity<StudentResponse> getById(@PathVariable(name = "id") int id) {
        return ResponseEntity.ok(service.getById(id));
    }
}
