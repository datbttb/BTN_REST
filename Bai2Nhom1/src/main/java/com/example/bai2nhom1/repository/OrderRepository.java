package com.example.bai2nhom1.repository;

import com.example.bai2nhom1.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Query("select o from Order o where o.companyID = ?2 and o.orderNumber = ?1")
    Order getOrderByOrOrderNumberAndCompanyID(String OrderNumber, String companyID);
}
