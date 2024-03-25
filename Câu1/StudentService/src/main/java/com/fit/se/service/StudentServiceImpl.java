package com.fit.se.service;

import com.fit.se.entity.Student;
import com.fit.se.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getListStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int studentId) {
        return studentRepository.findById(studentId).get();
    }
}
