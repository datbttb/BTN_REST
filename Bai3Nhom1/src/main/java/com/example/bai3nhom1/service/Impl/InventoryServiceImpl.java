package com.example.bai3nhom1.service.Impl;

import com.example.bai3nhom1.model.Inventory;
import com.example.bai3nhom1.repository.InventoryRepository;
import com.example.bai3nhom1.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;
    @Override
    public boolean checkInventory(String nameProduct, int quantity) {
        Inventory i = inventoryRepository.getByNameProduct(nameProduct);
        if(i.getStock() >= quantity) return true;
        return false;

    }
}
