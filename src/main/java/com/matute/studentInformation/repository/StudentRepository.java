package com.matute.studentInformation.repository;

import com.matute.studentInformation.modelo.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {

    Student findBynStudent(long nStudent);
    Student findByEmail (String email);
    List<Student> findByOrderByGpa();

}
