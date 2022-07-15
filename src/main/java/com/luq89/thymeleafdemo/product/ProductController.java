package com.luq89.thymeleafdemo.product;

import com.luq89.thymeleafdemo.fridge.DoorType;
import com.luq89.thymeleafdemo.fridge.Fridge;
import com.luq89.thymeleafdemo.fridge.FridgeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private FridgeService fridgeService;


    @GetMapping("/add")
    public String displayFridgeForm(Model model){
        model.addAttribute("fridges", fridgeService.getAvailableFridges());
        model.addAttribute("product", new Product());
        model.addAttribute("fridge", new Fridge());
        model.addAttribute("id");
        return "product/addProduct";
    }


    @PostMapping("/create/{id}")
    public String addProductToFridge(@ModelAttribute Product product,
//                                     @PathVariable long id
                                     @RequestBody Long id
//                                     @RequestParam(value = "id") Long id
    ) throws Exception {
        product.setFridge(fridgeService.getFridgeById(id));
        productService.addProductToFridge(product);
        log.info("Fridge with id: " + product.getProductName() + " fridge registered.");
        return "redirect:/product/add";
    }
}
