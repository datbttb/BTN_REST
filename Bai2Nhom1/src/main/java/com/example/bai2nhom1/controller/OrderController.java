package com.example.bai2nhom1.controller;

import com.example.bai2nhom1.service.OrderService;
import jakarta.websocket.server.PathParam;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/checkOrderStatus")
    public ResponseEntity<String> checkOrderStatus(@PathParam("orderNumber") String orderNumber,
                                                   @PathParam("companyID") String companyID){
        return ResponseEntity.ok(orderService.checkOrderStatus(orderNumber, companyID));
    }
}
