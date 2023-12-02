package com.OussamaDev.project.dao;

import com.OussamaDev.project.entity.Category;
import com.OussamaDev.project.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDAOImp implements CategoryDAO{
    private EntityManager entityManager ;

    public CategoryDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

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
