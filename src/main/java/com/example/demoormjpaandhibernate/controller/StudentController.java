package com.example.demoormjpaandhibernate.controller;

import com.example.demoormjpaandhibernate.model.Student;
import com.example.demoormjpaandhibernate.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Controller
    public class UserController {
        @Autowired
        private StudentServiceImpl studentService;

        @RequestMapping("/")
        public String getAll() {
            List<Student> students = studentService.getAllStudent();


            return students.toString();
        }

        @RequestMapping(value = "add")
        public Student addStudent(Student student) {
            studentService.addStudent(student);
            return student;
        }


        @RequestMapping(value = "/delete")
        public void deleteStudentById(int id) {
            studentService.deleteStudentById(id);
        }
    }
}