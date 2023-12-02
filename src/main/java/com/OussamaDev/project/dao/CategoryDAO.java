package com.OussamaDev.project.dao;

import com.OussamaDev.project.entity.Category;
import com.OussamaDev.project.entity.Product;

import java.util.List;

public interface CategoryDAO {
    void addCategory(Category category) ;
    void updateCategory(Category category) ;
    Product findCategoryById(int id) ;
    List<Category> findAllProduct() ;
}
