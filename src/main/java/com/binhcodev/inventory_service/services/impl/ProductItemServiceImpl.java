package com.binhcodev.inventory_service.services.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.binhcodev.inventory_service.entities.ProductConfiguration;
import com.binhcodev.inventory_service.entities.ProductItem;
import com.binhcodev.inventory_service.repositories.ProductConfigurationRepository;
import com.binhcodev.inventory_service.repositories.ProductItemRepository;
import com.binhcodev.inventory_service.requests.ProductItemRequest;
import com.binhcodev.inventory_service.services.ProductItemService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductItemServiceImpl implements ProductItemService {
    private final ProductItemRepository productItemRepository;
    private final ProductConfigurationRepository productConfigurationRepository;

    @Override
    public void saveAll(List<ProductItemRequest> productItemRequests) {
        for (ProductItemRequest productItemRequest : productItemRequests) {
            for (Map.Entry<String, BigDecimal> entry : productItemRequest.getVariationOptionsPrices().entrySet()) {
                ProductItem productItem = productItemRepository.save(ProductItem
                        .builder()
                        .productId(productItemRequest.getProductId())
                        .qtyInStock(10)
                        .SKU(entry.getKey() + "_" + entry.getValue())
                        .build());
                ProductConfiguration productConfiguration = ProductConfiguration
                        .builder()
                        .productItem(productItem)
                        .variationOptionId(entry.getKey())
                        .price(entry.getValue())
                        .build();
                productConfigurationRepository.save(productConfiguration);
            }
        }
    }

}
