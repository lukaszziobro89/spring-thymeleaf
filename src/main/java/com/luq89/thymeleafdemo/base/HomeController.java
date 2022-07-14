package com.luq89.thymeleafdemo.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage(){
        return "home";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

}
