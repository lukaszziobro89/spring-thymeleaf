package com.luq89.thymeleafdemo.fridge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FridgeService {


    @Autowired
    private FridgeRepository fridgeRepository;

    public Iterable<Fridge> getAvailableFridges() {
        return fridgeRepository.findAll();
    }

    public Fridge getFridgeById(Long fridgeId) throws Exception {
        return fridgeRepository.findById(fridgeId).orElseThrow(Exception::new);
    }

    public Fridge createFridge(Fridge fridge) {
        return fridgeRepository.save(fridge);
    }
}
