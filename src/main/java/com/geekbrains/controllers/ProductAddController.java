package com.geekbrains.controllers;

import com.geekbrains.model.Product;
import com.geekbrains.model.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/add_product")
public class ProductAddController {
    private Repository productRepos;

    @Autowired
    public ProductAddController(Repository repos) {
        this.productRepos = repos;
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String getForm(Model uiModel){
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "add-prod";
    }
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String create(Product product) {
        productRepos.addProduct(product);
        return "add-prod"; }
}

