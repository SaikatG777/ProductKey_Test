package com.springbootdemo.Sample.Controllers;

import com.springbootdemo.Sample.Entity.Product;
import com.springbootdemo.Sample.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllers {


    @Autowired
    private ProductService productService;

    @PostMapping("/sortProducts")
    public Product saveProduct(@RequestBody Product Product) {


       return productService.saveProduct(Product);

    }
}
