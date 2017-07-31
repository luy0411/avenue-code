package com.avenue.controller;

import com.avenue.entity.Product;
import com.avenue.manager.ProductManager;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    private final ProductManager manager;

    @Autowired
    public ProductController(ProductManager manager) {
        this.manager = manager;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String findAll(@RequestParam(name = "includeChildren", required = false) final boolean includeChildren) {
        List<Product> productList;

        if (includeChildren){
            productList = manager.findAll();
        }else {
            productList = manager.findAllWithoutChildren();
        }

        return new Gson().toJson(productList);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String findById(@PathVariable("id") final Long id,
                           @RequestParam(name = "includeChildren", required = false) final boolean includeChildren) {
        Product product;

        if (includeChildren){
            product = manager.findById(id);
        }else {
            product = manager.findByIdWithoutChildren(id);
        }

        return new Gson().toJson(product);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Product save(@RequestBody final Product product) {
        return manager.save(product);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public Product update(@RequestBody final Product product) {
        return manager.update(product);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void delete(@PathVariable("id") final Long id) {
        manager.delete(id);
    }

}