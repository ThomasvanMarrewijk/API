package com.uade.tpo.marketplace.entity.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductUpdateRequest {
    
    private String name;

    private String description;

    private BigDecimal price;

    private Integer stock;

    private Long categoryId;
}