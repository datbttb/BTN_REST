package com.example.bai1nhom1.controller;

import com.example.bai1nhom1.model.Card;
import com.example.bai1nhom1.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CardController {
    @Autowired
    private CardService cardService;

    @PostMapping("/creditCharged")
    public ResponseEntity<String> creditCharged(@RequestBody Card card){
        System.out.println(card);
        return ResponseEntity.ok(cardService.creditCharged(card));
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello");
    }

}
