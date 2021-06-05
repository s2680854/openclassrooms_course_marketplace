package com.openclassrooms.marketplace.controller;

import com.openclassrooms.marketplace.dao.ProductDao;
import com.openclassrooms.marketplace.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    //Products
    @GetMapping(value = "Products")
    public List<Product> productList() {
        return productDao.findAll();
    }

    //Produits/{id}
    @GetMapping(value = "Products/{id}")
    public Product displayProduct(@PathVariable int id){

        Product product = new Product(id, new String("vacuumCleaner"), 100);

        return product;
    }
}
