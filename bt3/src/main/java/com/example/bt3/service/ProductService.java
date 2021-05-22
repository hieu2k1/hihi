package com.example.bt3.service;

import com.example.bt3.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAll();
    ProductEntity createProduct(ProductEntity p);
    void deleteProduct(int id);
    ProductEntity updateProduct(ProductEntity p);
    List<ProductEntity> getProductByName(String name);
}

