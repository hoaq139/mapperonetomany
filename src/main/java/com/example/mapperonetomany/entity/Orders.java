package com.example.mapperonetomany.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    int orderId;
    @Column(name = "Address")
    String address;
    @Column(name = "CustomerName")
    String customerName;
    @Column(name = "Phone")
    String phone;
    @ManyToOne()
    @JoinColumn(name = "ProductID")
    Products products;


}
