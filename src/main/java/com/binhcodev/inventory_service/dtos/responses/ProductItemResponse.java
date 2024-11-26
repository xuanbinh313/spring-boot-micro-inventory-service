package com.binhcodev.inventory_service.dtos.responses;

import java.util.List;

import com.binhcodev.inventory_service.entities.ProductItem;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class ProductItemResponse {
    ProductItem productItem;
    List<String> variationOptions;
}
