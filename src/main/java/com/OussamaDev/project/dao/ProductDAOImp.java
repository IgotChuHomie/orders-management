package com.OussamaDev.project.dao;

import com.OussamaDev.project.entity.Product;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImp implements ProductDAO{
    private EntityManager entityManager ;

    public ProductDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public Product findProductById(int id) {
        return null;
    }

    @Override
    public List<Product> findAllProduct() {
        return null;
    }
}
