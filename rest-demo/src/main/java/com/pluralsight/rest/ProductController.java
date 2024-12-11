package com.pluralsight.rest;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/rest/products")
public class ProductController {

    @GetMapping
    @RequestMapping(path = "/{id}")
    public Product findById(@PathVariable("id") Integer productId){
        return new Product(2,"ps5","electronic",150.00);
    }

    @GetMapping
    public List<Product> findAll(){
        List<Product> res = new ArrayList<>();
        res.add(new Product(1,"psp","electronic",150.00));
        return res;
    }

    public void delete

}
