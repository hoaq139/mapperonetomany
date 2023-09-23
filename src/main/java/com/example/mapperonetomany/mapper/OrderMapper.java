package com.example.mapperonetomany.mapper;

import com.example.mapperonetomany.dto.OrderDTOCreate;
import com.example.mapperonetomany.entity.Orders;
import jakarta.persistence.criteria.Order;

public class OrderMapper {
    public static Orders toOrder(OrderDTOCreate orderDTOCreate){
        return Orders.builder()
                .orderId(orderDTOCreate.getOrderId())
                .address(orderDTOCreate.getAddress())
                .phone(orderDTOCreate.getPhone())
                .customerName(orderDTOCreate.getCustomerName())
                .products.getProductName(orderDTOCreate.getProduct())
                .build();
    }
}
