package com.openclassrooms.marketplace.dao;

import com.openclassrooms.marketplace.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, new String("laptop"), 350));
        products.add(new Product(2, new String("robotVacuumCleaner"), 500));
        products.add(new Product(3, new String("pingPongTable"), 750));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }
}
