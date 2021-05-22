package com.example.bt3.controller;


import com.example.bt3.entity.ProductEntity;
import com.example.bt3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    ProductService productService;

    @GetMapping({"/","/index"})
    public String index(Model model){
        String msg = "Hello Spring Boot + JSP";
        model.addAttribute("msg",msg);
        List<ProductEntity> products = productService.getAll();
        model.addAttribute("products", products);
        return "index";
    }
}
