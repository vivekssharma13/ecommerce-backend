package com.practice.ProductService.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponseDTO {
    private long id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private String category;
}
