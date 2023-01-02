package com.example.demoormjpaandhibernate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "studentTable")
public class Student {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String Firstname;
    @Column
    private String LastName;
    @Column
    private String age;
    @Column
    private String classes;

    public Student( ) {
    }

    public Student(int id, String firstname, String lastName, String age, String classes) {
        this.id = id;
        Firstname = firstname;
        LastName = lastName;
        this.age = age;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}

