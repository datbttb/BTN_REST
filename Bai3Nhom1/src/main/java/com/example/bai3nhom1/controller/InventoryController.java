package com.example.bai3nhom1.controller;

import com.example.bai3nhom1.service.InventoryService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/checkInventory")
    public ResponseEntity<String> checkInventory(@PathParam("nameProduct") String nameProduct,
                                            @PathParam("quantity") int quantity){
        System.out.println(nameProduct + "  " + quantity);
        if(inventoryService.checkInventory(nameProduct, quantity)) {
            return ResponseEntity.ok("Sản phẩm vẫn còn trong kho");
        }
        return ResponseEntity.ok("Số lượng sản phẩm trong kho không đủ");
    }

}
