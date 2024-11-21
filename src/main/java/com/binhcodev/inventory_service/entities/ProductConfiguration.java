package com.binhcodev.inventory_service.entities;

import java.math.BigDecimal;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductConfiguration {
    @Id
    private Long id;

    @ManyToMany()
    private ProductItem productItem;

    private String variationOptionId;

    private BigDecimal price;
}
