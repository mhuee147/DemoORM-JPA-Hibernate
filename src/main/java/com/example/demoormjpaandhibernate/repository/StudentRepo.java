package com.example.demoormjpaandhibernate.repository;

import com.example.demoormjpaandhibernate.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
