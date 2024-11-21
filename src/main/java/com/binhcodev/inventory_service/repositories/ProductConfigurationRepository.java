package com.binhcodev.inventory_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binhcodev.inventory_service.entities.ProductConfiguration;

public interface ProductConfigurationRepository extends JpaRepository<ProductConfiguration,Long> {
    
}
