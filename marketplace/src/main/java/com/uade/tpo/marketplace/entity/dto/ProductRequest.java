package com.uade.tpo.marketplace.entity.dto;

import java.math.BigDecimal;

import com.uade.tpo.marketplace.entity.Category;

import lombok.Data;

@Data
public class ProductRequest {
    
    private String name;

    private String description;

    private BigDecimal price;

    private Integer stock;

    private Category category;
}
