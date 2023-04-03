package com.example.bai2nhom1.service;

import com.example.bai2nhom1.model.Order;
import com.example.bai2nhom1.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public String checkOrderStatus(String OrderNumber, String companyID){
        Order order = orderRepository.getOrderByOrOrderNumberAndCompanyID(OrderNumber, companyID);
        return order.getStatus();
    }
}
