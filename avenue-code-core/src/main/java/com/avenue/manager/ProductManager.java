package com.avenue.manager;

import com.avenue.entity.Image;
import com.avenue.entity.Product;
import com.avenue.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Component
public class ProductManager {

    private final ProductRepository repository;

    @Autowired
    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Product save(final Product product) {
        if (product.getParent() != null){
            product.setParent(repository.findOne(product.getParent().getId()));
        }
        return repository.saveAndFlush(product);
    }

    public Product update (final Product product) {
        return repository.saveAndFlush(product);
    }

    public List<Product> findAllWithoutChildren() {
        return repository.findAllWithoutChildren();
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findByIdWithoutChildren(final Long id) {
        return repository.findByIdWithoutChildren(id);
    }

    public Product findById(final Long id){ return repository.findOne(id); }

    public Set<Image> findChildrenImages(final Long id) {
        Product product = repository.findOne(id);
        return product.getImages();
    }

    public List<Product> findChildrenProducts(final Long id){
        return repository.findAllChildrenProducts(id);
    }

    public void delete(final Long id){ repository.delete(id); }

}