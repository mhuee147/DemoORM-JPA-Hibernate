package com.example.demoormjpaandhibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class StudentRepo {
    @PersistenceContext
    EntityManager entityManager;

    public Student insertStudent(Student student)
    {
        return entityManager.merge(student);
    }

    public Student updateStudent(Student student)
    {
        return entityManager.merge(student);
    }

    public Student getStudentrById(int id) {
        return entityManager.find(Student.class, id);
    }

    public void deleteById(int id){
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
    }
}
