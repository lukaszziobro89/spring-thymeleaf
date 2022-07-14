package com.luq89.thymeleafdemo.product;

import com.luq89.thymeleafdemo.fridge.DoorType;
import com.luq89.thymeleafdemo.fridge.Fridge;
import com.luq89.thymeleafdemo.fridge.FridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private FridgeRepository fridgeRepository;

    public Product addProductToFridge(Product product){
        return productRepository.save(product);
    }

}
