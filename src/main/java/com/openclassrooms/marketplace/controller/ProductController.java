package com.openclassrooms.marketplace.controller;

import com.openclassrooms.marketplace.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    //Produits/{id}
    @GetMapping(value = "Products/{id}")
    public Product displayProduct(@PathVariable int id){

        Product product = new Product(id, new String("vacuumCleaner"), 100);

        return product;
    }
}
