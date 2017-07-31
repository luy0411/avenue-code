package com.avenue.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.avenue.entity.Product;
import com.avenue.repository.ProductRepository;

import java.util.List;

@Component
public class ProductManager {

    private Logger LOGGER = LoggerFactory.getLogger(ProductManager.class);

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

}