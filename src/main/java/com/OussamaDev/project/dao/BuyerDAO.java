package com.OussamaDev.project.dao;
import com.OussamaDev.project.entity.Buyer;
import com.OussamaDev.project.entity.Product;

import java.util.List;

public interface BuyerDAO {
    void addBuyer(Buyer buyer) ;
    void updateBuyer(Buyer buyer) ;
    Buyer findBuyerById(int id) ;
    List<Buyer> findAllBuyers() ;
    void deleteBuyerById(int id) ;
}
