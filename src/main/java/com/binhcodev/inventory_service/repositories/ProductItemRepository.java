package com.binhcodev.inventory_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binhcodev.inventory_service.entities.ProductItem;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
    
}
