package com.practice.ProductService.Services;

import com.practice.ProductService.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(int id);
    List<Product> getAllProducts();
    Product addProduct(String name, String description, double price, String imageUrl, String category);
}
