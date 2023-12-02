package com.OussamaDev.project.dao;

import com.OussamaDev.project.entity.Category;
import com.OussamaDev.project.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDAOImp implements CategoryDAO{
    @Override
    public void addCategory(Category category) {

    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public Product findCategoryById(int id) {
        return null;
    }

    @Override
    public List<Category> findAllProduct() {
        return null;
    }
}
