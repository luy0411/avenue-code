package com.avenue.repository;

import com.avenue.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT NEW com.avenue.entity.Product(id, name) from Product")
    List<Product> findAllWithoutChildren();

    @Query("SELECT NEW com.avenue.entity.Product(id, name) from Product WHERE id = :id")
    Product findByIdWithoutChildren(@Param("id") final Long id);

}