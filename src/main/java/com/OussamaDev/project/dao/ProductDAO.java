package com.OussamaDev.project.dao;

import com.OussamaDev.project.entity.Product;

import java.util.List;

public interface ProductDAO {
    void addProduct(Product product) ;
    void updateProduct(Product product) ;
    Product findProductById(int id) ;
    List<Product> findAllProduct() ;
}
