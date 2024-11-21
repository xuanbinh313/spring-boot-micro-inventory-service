package com.binhcodev.inventory_service.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.binhcodev.inventory_service.requests.ProductItemRequest;
import com.binhcodev.inventory_service.services.ProductItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products-items")
@RequiredArgsConstructor
public class ProductItemController {
    private final ProductItemService productItemService;

    @GetMapping
    public String getInventories() {
        return "All inventories";
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveAll(List<ProductItemRequest> productItemRequests) {
        productItemService.saveAll(productItemRequests);
    }

    @GetMapping("/create")
    public String createInventory() {
        return "Inventory created";
    }
}
