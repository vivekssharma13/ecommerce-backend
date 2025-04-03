package com.practice.ProductService.Services;

import com.practice.ProductService.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtherProductService implements ProductService{
    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product addProduct(String name, String description, double price, String imageUrl, String category) {
        return null;
    }
}
