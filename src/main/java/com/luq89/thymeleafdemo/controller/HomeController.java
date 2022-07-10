package com.luq89.thymeleafdemo.controller;

import com.luq89.thymeleafdemo.model.Student;
import com.luq89.thymeleafdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String home(ModelMap map){
        map.put("hello_var", "Hello, luq89!");
        return "home";
    }

    @RequestMapping(value = "/hello", method = {RequestMethod.GET,RequestMethod.POST})
    public String hello(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String helloAgain(@PathVariable String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/students")
    public String showAllStudents(Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "students";
    }

    @GetMapping("/addStudents")
    public String addStudents(Model model){
        Student student_1 = new Student();
        student_1.setEmail("s1@java.com");
        student_1.setName("David");
        studentRepository.save(student_1);

        Student student_2 = new Student();
        student_2.setEmail("s2@java.com");
        student_2.setName("John");
        studentRepository.save(student_2);
        return "students";
    }

}
