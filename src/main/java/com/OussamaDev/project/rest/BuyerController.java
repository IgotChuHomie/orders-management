package com.OussamaDev.project.rest;

import com.OussamaDev.project.entity.Buyer;
import com.OussamaDev.project.exception.BuyerErrorResponse;
import com.OussamaDev.project.exception.BuyerNotFoundException;
import com.OussamaDev.project.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BuyerController {
    private BuyerService buyerService;

    @Autowired
    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @GetMapping("/buyers")
    public List<Buyer> buyers() {
        return buyerService.findAllBuyers();
    }

    @GetMapping("/buyers/{id}")
    public Buyer getBuyerById(@PathVariable() int id) {
        if (buyerService.findBuyerById(id) == null) {
            throw new BuyerNotFoundException("the student with the id doesn't exit ! " + id);
        }
        return buyerService.findBuyerById(id);
    }

    @DeleteMapping("/buyers/{id}")
    public void deleteBuyerById(@PathVariable() int id) {
        if (buyerService.findBuyerById(id) == null) {
            throw new BuyerNotFoundException("can't delete because the buyer with this id not existing :  " + id);
        }
        buyerService.deleteBuyerById(id);
    }

    @PostMapping("/buyers")
    public ResponseEntity<BuyerErrorResponse> addBuyer(@RequestBody() Buyer buyer) {
        buyerService.addBuyer(buyer);

        BuyerErrorResponse errorResponse = new BuyerErrorResponse();
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setStatus(HttpStatus.OK.value());
        errorResponse.setMessage("the buyer added succefully ");

        return new ResponseEntity<>(errorResponse, HttpStatus.OK);
    }

}
