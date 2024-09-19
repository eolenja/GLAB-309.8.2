package com.example.StudentLogin.service;

import com.example.StudentLogin.dto.StudentDto;
import com.example.StudentLogin.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDto studentDto);
    Student findStudentByEmail(String email);
    List<StudentDto> findAllStudents();
}
