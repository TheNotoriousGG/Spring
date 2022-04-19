package com.geekbrains.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Repository {
    private final List<Product> repos;

    public Repository(){
        repos = new ArrayList<>();
    }

    public List<Product> getProductList(){
        return repos;
    }

    public Product getProduct(int id){
        for (Product p: repos) {
            if(p.getId() == id)
                return p;
        }
        return null;
    }

    public void addProduct(Product p){
        repos.add(p);
    }
}
