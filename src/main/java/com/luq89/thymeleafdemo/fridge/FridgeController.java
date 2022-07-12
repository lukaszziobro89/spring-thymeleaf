package com.luq89.thymeleafdemo.fridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fridges")
public class FridgeController {

    Logger logger = LoggerFactory.getLogger(FridgeController.class);

    @Autowired
    private FridgeService service;

    @GetMapping("/")
    public String showAllFridges(Model model){
        model.addAttribute("fridges", service.getAvailableFridges());
        return "fridge/fridges";
    }

    @GetMapping("/add")
    public String displayFridgeForm(Model model){
        Fridge aFridge = new Fridge();
        model.addAttribute("fridge", aFridge);
        model.addAttribute("doorTypes", DoorType.values());
        return "fridge/addFridge";
    }

    @PostMapping("/create")
    public String createFridge(Fridge fridge, Model model){
        service.createFridge(fridge);
        logger.info("Fridge with id: " + fridge.getId() + " fridge registered.");
        return "redirect:/fridges/add";
    }
}
