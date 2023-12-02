package com.OussamaDev.project.dao;

import com.OussamaDev.project.entity.Buyer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BuyerDAOImp implements BuyerDAO{
    private EntityManager entityManager ;

    public BuyerDAOImp(EntityManager entityManager){
        this.entityManager = entityManager ;
    }

    @Override
    @Transactional
    public void addBuyer(Buyer buyer) {
        entityManager.persist(buyer);
    }

    @Override
    @Transactional
    public void updateBuyer(Buyer buyer) {
        // to perform the update
        buyer.setId(1);
        entityManager.merge(buyer);
    }

    @Override
    public Buyer findBuyerById(int id) {
        Buyer buyer = entityManager.find(Buyer.class , id) ;
        return buyer ;
    }

    @Override
    public List<Buyer> findAllBuyers() {
        TypedQuery<Buyer> buyersQuery = entityManager.createQuery("from Buyer ",Buyer.class) ;
        var buyers = buyersQuery.getResultList() ;
        return buyers ;
    }

    @Override
    @Transactional
    public void deleteBuyerById(int id) {
        Buyer buyer = entityManager.find(Buyer.class , id) ;
        entityManager.remove(buyer);
    }
}
