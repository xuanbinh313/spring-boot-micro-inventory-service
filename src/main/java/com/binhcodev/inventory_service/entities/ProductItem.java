package com.binhcodev.inventory_service.entities;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product_items")
@Getter
@Setter
@Builder
public class ProductItem {
    @Id
    @Column(columnDefinition = "SERIAL")
    private Long id;
    private String productId;
    private String SKU;
    private int qtyInStock;
}
