package com.example.bai1nhom1.service;

import com.example.bai1nhom1.model.Card;
import com.example.bai1nhom1.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;

    public String creditCharged(Card card){
        cardRepository.save(card);
        return "200000";
    }
}
