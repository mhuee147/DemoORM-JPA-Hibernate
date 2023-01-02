package com.example.demoormjpaandhibernate.service;

import com.example.demoormjpaandhibernate.model.Student;
import com.example.demoormjpaandhibernate.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
    StudentRepo studentRepo;
    @Override
    public Student addStudent(Student student) {
        studentRepo.save(student);
        return student;
    }


    @Override
    public List<Student> getAllStudent() {
        return  studentRepo.findAll();
    }


    @Override
    public void deleteStudentById(int id) {
        studentRepo.deleteById(id);
    }
}
