package com.OussamaDev.project.dao;

import com.OussamaDev.project.entity.Order;
import com.OussamaDev.project.entity.Product;

import java.util.List;

public interface OrderDAO {
    void addOrder(Order order) ;
    void updateOrder(Order order) ;
    Order findOrderById(int id) ;
    List<Order> findAllOrders() ;
}
