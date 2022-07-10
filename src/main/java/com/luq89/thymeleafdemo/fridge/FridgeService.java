package com.luq89.thymeleafdemo.fridge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class FridgeService {


    @Autowired
    private FridgeRepository fridgeRepository;

    public Iterable<Fridge> getAvailableFridges() {
        return fridgeRepository.findAll();
    }

    public Fridge createFridge(Fridge fridge) {
        return fridgeRepository.save(fridge);
    }
}
