package com.OussamaDev.project.dao;

import com.OussamaDev.project.entity.Order;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDAOImp implements OrderDAO{
    private EntityManager entityManager ;

    public OrderDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void addOrder(Order order) {

    }

    @Override
    public void updateOrder(Order order) {

    }

    @Override
    public Order findOrderById(int id) {
        return null;
    }

    @Override
    public List<Order> findAllOrders() {
        return null;
    }
}
