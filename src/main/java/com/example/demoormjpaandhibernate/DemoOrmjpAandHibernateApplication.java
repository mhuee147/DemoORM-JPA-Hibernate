package com.example.demoormjpaandhibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class DemoOrmjpAandHibernateApplication implements CommandLineRunner {
    private org.slf4j.Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    @Autowired
    StudentRepo studentRepo;

    public static void main(String[] args) {
        SpringApplication.run(DemoOrmjpAandHibernateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SpringDataJPA();
    }
    private void SpringDataJPA() {
        // ex1
        logger.info("\n\n>> Inserting Student: {}\n", studentRepo.insertStudent(
                new Student(1, "Hue")));
        logger.info("\n\n>> Inserting Student: {}\n", studentRepo.insertStudent(
                new Student(2, "Ngoc")));
        logger.info("\n\n>> Inserting Student: {}\n", studentRepo.insertStudent(
                new Student(3, "Huyen")));

        // ex2
        logger.info("\n\n>> Student with id 2: {}\n", studentRepo.getStudentrById(2));

        // ex3
        logger.info("\n\n>> Inserting Student: {}\n", studentRepo.insertStudent(
                new Student(4, "Austria")));
        logger.info("\n\n>> Updating Student with Id 3: {}\n", studentRepo.updateStudent(
                new Student(5, "Thiem")));
        logger.info("\n\n>> Player with id 3: {}\n", studentRepo.getStudentrById(3));

        //delete player
        studentRepo.deleteById(2);
    }
}
