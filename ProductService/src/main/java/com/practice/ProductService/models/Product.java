package com.practice.ProductService.models;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private Category category;
}
