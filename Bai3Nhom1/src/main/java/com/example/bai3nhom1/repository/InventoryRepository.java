package com.example.bai3nhom1.repository;

import com.example.bai3nhom1.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
    @Query("select i from Inventory i where i.nameProduct = ?1")
    Inventory getByNameProduct(String productName);
}
