package com.practice.ProductService.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddProductDTO {
    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private String category;
}