package com.practice.ProductService.models;

import com.practice.ProductService.dtos.ProductResponseDTO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private Category category;

    public ProductResponseDTO productResponseDTO(){
        return ProductResponseDTO.builder()
                .id(id)
                .name(name)
                .description(description)
                .price(price)
                .imageUrl(imageUrl)
                .category(category.getName())
                .build();
    }
}
