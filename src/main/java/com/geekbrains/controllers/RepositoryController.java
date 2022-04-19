package com.geekbrains.controllers;

import com.geekbrains.model.Product;
import com.geekbrains.model.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/repos")
public class RepositoryController {
    private Repository repos;

    @Autowired
    public RepositoryController(Repository repos){
        this.repos = repos;
    }

    @RequestMapping("/")
    public String getForm(Model uiModel){
        uiModel.addAttribute("repos", repos.getProductList());
        return "repos";
    }
}
