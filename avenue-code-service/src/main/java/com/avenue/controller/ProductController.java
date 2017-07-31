package com.avenue.controller;

import com.avenue.manager.ProductManager;
import com.avenue.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductManager manager;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    @ResponseBody
    public List<Product> findAll() {
        List<Product> all = manager.findAll();
        return all;
    }

}