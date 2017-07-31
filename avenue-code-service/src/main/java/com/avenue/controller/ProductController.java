package com.avenue.controller;

import com.avenue.entity.Image;
import com.avenue.entity.Product;
import com.avenue.manager.ProductManager;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

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
    public String findAll(@RequestParam(name = "loadChildren", required = false) final boolean loadChildren) {
        List<Product> productList;

        if (loadChildren){
            productList = manager.findAll();
        }else {
            productList = manager.findAllWithoutChildren();
        }

        return new Gson().toJson(productList);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String findById(@PathVariable("id") final Long id,
                           @RequestParam(name = "loadChildren", required = false) final boolean loadChildren) {
        Product product;

        if (loadChildren){
            product = manager.findById(id);
        }else {
            product = manager.findByIdWithoutChildren(id);
        }

        return new Gson().toJson(product);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/{id}/images")
    public String findImages(@PathVariable("id") final Long id) {
        Set<Image> childrenImages = manager.findChildrenImages(id);
        return new Gson().toJson(childrenImages);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/{id}/childrenProducts")
    public String findChldren(@PathVariable("id") final Long id) {
        List<Product> childrenProducts = manager.findChildrenProducts(id);
        return new Gson().toJson(childrenProducts);
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