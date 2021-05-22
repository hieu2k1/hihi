package com.example.bt3.service;

import com.example.bt3.entity.ProductEntity;
import com.example.bt3.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity createProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public List<ProductEntity> getProductByName(String name) {
        List<ProductEntity> list = productRepo.findProductEntityByName(name);
        return list;
    }
}
