//package com.luq89.thymeleafdemo.controller;
//
//import com.luq89.thymeleafdemo.repository.StudentRepository;
//import com.luq89.thymeleafdemo.model.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
////@CrossOrigin
////@RestController
//@Controller
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @GetMapping("/api/students")
//    public Iterable<Student> getUsers(){
//
//        Student student_1 = new Student();
//        student_1.setEmail("s1@java.com");
//        student_1.setName("David");
//        studentRepository.save(student_1);
//
//        Student student_2 = new Student();
//        student_2.setEmail("s2@java.com");
//        student_2.setName("John");
//        studentRepository.save(student_2);
//
//        return studentRepository.findAll();
//    }
//
//}
