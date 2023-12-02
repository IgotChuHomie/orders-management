package com.OussamaDev.project.service;

import com.OussamaDev.project.entity.Buyer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BuyerService {
    List<Buyer> findAllBuyers() ;
     Buyer findBuyerById(int id) ;

    void deleteBuyerById(int id) ;
    void addBuyer(Buyer buyer) ;

}
