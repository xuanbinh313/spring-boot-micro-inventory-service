package com.binhcodev.inventory_service.services;

import java.util.List;

import com.binhcodev.inventory_service.requests.ProductItemRequest;

public interface ProductItemService {
    public void saveAll(List<ProductItemRequest> productItemRequests);
}
