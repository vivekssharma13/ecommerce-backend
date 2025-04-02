package com.practice.ProductService.dtos;

import lombok.Data;

@Data
public class ProductResponseDTO {
    private String id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private String category;
}
