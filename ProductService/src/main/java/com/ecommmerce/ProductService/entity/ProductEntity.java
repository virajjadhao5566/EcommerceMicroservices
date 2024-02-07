package com.ecommmerce.ProductService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    for generate values in increament by 1 order
    @Column(name = "ID")
    private long productId;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRICE")
    private long price;
    @Column(name = "QUANTITY")
    private long quantity;
}
