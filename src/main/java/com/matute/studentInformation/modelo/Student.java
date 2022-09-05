package com.matute.studentInformation.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String nombre;
    private Long nStudent;
    private String email;
    private List<String> courseList;
    private float gpa;

    public Student() {
    }

    public Student(String id, String nombre, Long nStudent, String email, List<String> courseList, float gpa) {
        this.id = id;
        this.nombre = nombre;
        this.nStudent = nStudent;
        this.email = email;
        this.courseList = courseList;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getnStudent() {
        return nStudent;
    }

    public void setnStudent(Long nStudent) {
        this.nStudent = nStudent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
