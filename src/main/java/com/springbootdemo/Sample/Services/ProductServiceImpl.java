package com.springbootdemo.Sample.Services;

import com.springbootdemo.Sample.Entity.Product;
import com.springbootdemo.Sample.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    public ProductRepo productRepository;
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> fetchProductList() {
        return productRepository.findAll();
    }
}
