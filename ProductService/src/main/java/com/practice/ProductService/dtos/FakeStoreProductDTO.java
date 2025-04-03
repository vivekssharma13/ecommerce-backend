package com.practice.ProductService.dtos;

import com.practice.ProductService.models.Category;
import com.practice.ProductService.models.Product;
import com.practice.ProductService.models.Rating;
import lombok.Data;

@Data
public class FakeStoreProductDTO {
    private int id;;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private Rating rating;

    public Product toProduct(){
        Category category1 = new Category();
        category1.setName(this.category);

        return Product.builder()
                .id(id)
                .name(title)
                .description(description)
                .price(price)
                .imageUrl(image)
                .category(category1)
                .build();
    }
}
