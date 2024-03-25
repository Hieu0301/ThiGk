package com.fit.se.service;

import com.fit.se.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getListStudents();

    public Student getStudentById(int studentId);

}
