package com.luq89.thymeleafdemo.controller;

import com.luq89.thymeleafdemo.repository.FridgeRepository;
import com.luq89.thymeleafdemo.model.Fridge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FridgeController {

    @Autowired
    private FridgeRepository fridgeRepository;

    @GetMapping("/fridges")
    public String showAllFridges(Model model){
        model.addAttribute("fridges", fridgeRepository.findAll());
        return "fridges";
    }

    @GetMapping("/addFridges")
    public String addFridge(Model model){
        Fridge fridge_1 = new Fridge();
        fridge_1.setDoorType("French Door");
        fridge_1.setProducerName("Samsung");
        fridgeRepository.save(fridge_1);

        Fridge fridge_2 = new Fridge();
        fridge_2.setDoorType("Side-by-side");
        fridge_2.setProducerName("Beko");
        fridgeRepository.save(fridge_2);
        return "fridges";
    }
}
