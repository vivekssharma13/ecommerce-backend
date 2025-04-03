package com.practice.ProductService.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FakeStoreProductRequestDTO {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
}
