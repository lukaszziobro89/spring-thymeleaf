package com.luq89.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

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

}
