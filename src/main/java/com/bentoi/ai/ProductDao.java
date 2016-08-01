package com.bentoi.ai;

import java.util.List;

import com.bentoi.ai.model.Products;


public interface ProductDao {

    public List<Products> getAllProducts();
    
    public void addProduct(Products Prdct);

}
