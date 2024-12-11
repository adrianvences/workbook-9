package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {

    public SimpleProductDao() {
        inventory.add(new Product());
        inventory.add(new Product());
        inventory.add(new Product());
        inventory.add(new Product());
        inventory.add(new Product());

    }

    List<Product> inventory = new ArrayList<>();


    @Override
    public void add(Product product) {
        inventory.add(product);
    }

    @Override
    public List<Product> getAll() {

        return inventory;
    }
}
