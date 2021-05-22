package com.example.bt3.repository;

import com.example.bt3.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

    @Query("select p from ProductEntity p where p.name like %:name%")
    List<ProductEntity> findProductByName(String name);

    List<ProductEntity> findAllByCategoryidAndPrice(int id, int price);
}
