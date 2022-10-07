package com.springbootdemo.Sample.Services;

import com.springbootdemo.Sample.Entity.Product;

import java.util.List;


public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> fetchProductList();
}
