package com.binhcodev.inventory_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventories")
public class InventoryRepository {
    @GetMapping
    public String getInventories() {
        return "All inventories";
    }

    @GetMapping("/create")
    public String createInventory() {
        return "Inventory created";
    }
}
