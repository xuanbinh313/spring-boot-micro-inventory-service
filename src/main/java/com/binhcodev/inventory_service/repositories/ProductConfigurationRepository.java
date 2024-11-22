package com.binhcodev.inventory_service.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binhcodev.inventory_service.entities.ProductConfiguration;
import com.binhcodev.inventory_service.entities.ProductItem;

public interface ProductConfigurationRepository extends JpaRepository<ProductConfiguration,Long> {
    List<ProductConfiguration> findAllByProductItemIn(List<ProductItem> productItem);
}
