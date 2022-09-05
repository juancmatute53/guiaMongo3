package com.matute.studentInformation.service;

import com.matute.studentInformation.modelo.Student;
import com.matute.studentInformation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository StudRepo;

    @Override
    public List<Student> findAll() {
        return StudRepo.findAll();
    }

    @Override
    public Student findBynStudent(long nStudent) {
        return StudRepo.findBynStudent(nStudent);
    }

    @Override
    public Student findByEmail(String email) {
        return StudRepo.findByEmail(email);
    }

    @Override
    public List<Student> findByOrderByGpa() {
        return StudRepo.findByOrderByGpa();
    }

    @Override
    public void saveOrUpdateStudent(Student student) {
        StudRepo.save(student);
    }

    @Override
    public void deleteStudent(String id) {
        StudRepo.deleteById(id);
    }
}
