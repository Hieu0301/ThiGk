package com.fit.se.controller;

import com.fit.se.entity.Student;
import com.fit.se.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public ResponseEntity<?> saveStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.saveStudent(student));
    }

    @GetMapping("/students/{StudentId}")
    public ResponseEntity<?> getStudentById(@PathVariable("StudentId") int studentId) {
        return ResponseEntity.ok(studentService.getStudentById(studentId));
    }

    @GetMapping("/students")
    public ResponseEntity<?> getListStudents() {
        return ResponseEntity.ok(studentService.getListStudents());
    }

}
