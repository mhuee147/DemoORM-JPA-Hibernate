package com.example.demoormjpaandhibernate.service;

import com.example.demoormjpaandhibernate.model.Student;

import java.util.List;

public interface IStudentService {
    public Student addStudent(Student student);
    public List<Student> getAllStudent();
    public void deleteStudentById(int id);
}
