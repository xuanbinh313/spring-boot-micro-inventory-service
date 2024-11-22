package com.binhcodev.inventory_service.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.binhcodev.inventory_service.dtos.requests.ProductItemRequest;
import com.binhcodev.inventory_service.dtos.responses.ProductItemResponse;

public interface ProductItemService {
    public void saveAll(List<ProductItemRequest> productItemRequests);
    public List<ProductItemResponse> getAllProductsItems();
}
