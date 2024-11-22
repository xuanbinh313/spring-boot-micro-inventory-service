package com.binhcodev.inventory_service.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.binhcodev.inventory_service.dtos.requests.ProductItemRequest;
import com.binhcodev.inventory_service.dtos.responses.ProductItemResponse;
import com.binhcodev.inventory_service.services.ProductItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products-items")
@RequiredArgsConstructor
public class ProductItemController {
    private final ProductItemService productItemService;

    @GetMapping
    public ResponseEntity<List<ProductItemResponse>> getAll() {
        List<ProductItemResponse> productItemResponses = productItemService.getAllProductsItems();
        return ResponseEntity.ok(productItemResponses);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveAll(@RequestBody List<ProductItemRequest> productItemRequests) {
        productItemService.saveAll(productItemRequests);
    }

    @GetMapping("/create")
    public String createInventory() {
        return "Inventory created";
    }
}
