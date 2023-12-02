package com.OussamaDev.project.service;

import com.OussamaDev.project.dao.BuyerDAO;
import com.OussamaDev.project.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerServiceImp implements BuyerService{
    private BuyerDAO buyerDAO ;

    public BuyerServiceImp(BuyerDAO buyerDAO){
        this.buyerDAO = buyerDAO ;
    }


    @Override
    public List<Buyer> findAllBuyers() {
        return buyerDAO.findAllBuyers();
    }

    @Override
    public Buyer findBuyerById(int id) {
        return buyerDAO.findBuyerById(id);
    }

    @Override
    public void deleteBuyerById(int id) {
        buyerDAO.deleteBuyerById(id);
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyerDAO.addBuyer(buyer);
    }
}
