package com.practice.ProductService.controller;

import com.practice.ProductService.dtos.ProductResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping(path = "/")
    public ProductResponseDTO getProductById()
    {
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setCategory("Test Category");
        responseDTO.setId("ASJSGDT123");
        responseDTO.setName("Test Product");
        responseDTO.setPrice(200.14);
        responseDTO.setDescription("Test Description");
        responseDTO.setImageUrl("https://example.com/image.jpg");
        return responseDTO;
    }
}
