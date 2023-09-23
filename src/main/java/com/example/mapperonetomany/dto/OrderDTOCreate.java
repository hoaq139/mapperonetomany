package com.example.mapperonetomany.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDTOCreate {
    int orderId;
    String customerName;
    String address;
    String phone;
    String product;



}
