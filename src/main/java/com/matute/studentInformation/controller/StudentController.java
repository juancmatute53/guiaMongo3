package com.matute.studentInformation.controller;

import com.matute.studentInformation.modelo.Student;
import com.matute.studentInformation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/")
    public List<Student> getAllStudent(){
        return studentService.findAll();
    }

    @GetMapping(value = "/{nStudent}")
    public Student findByNStudent (@PathVariable ("student") Long nStudent ){
        return studentService.findBynStudent(nStudent);
    }

    @GetMapping(value = "/{email}")
    public Student getByEmail (String email){
            return studentService.findByEmail(email);
    }

    @GetMapping(value = "/orderByGpa")
    public List<Student> findAllByOrderByGpaDesc(){
        return studentService.findByOrderByGpa();
    }
    @PostMapping(value = "/crear")
    public ResponseEntity<?> SaveOrUpdateStudent(@RequestBody Student student){
        studentService.saveOrUpdateStudent(student);
        return new ResponseEntity("Estudiante Agregado con exito", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{nStudent}")
    public void DeleteStudent (@PathVariable Long nStudent){
        studentService.deleteStudent(studentService.findBynStudent(nStudent).getId());
    }

}
