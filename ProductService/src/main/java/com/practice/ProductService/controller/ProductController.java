package com.practice.ProductService.controller;
import com.practice.ProductService.Services.ProductService;
import com.practice.ProductService.dtos.ProductResponseDTO;
import com.practice.ProductService.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    @Autowired
    @Qualifier("fakeProductService")
    ProductService productService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<ProductResponseDTO> getProductById(@PathVariable int id)
    {
        ProductResponseDTO responseDTO = productService.getProductById(id).productResponseDTO();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(path = "")
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts()
    {
        List<Product> allProducts = productService.getAllProducts();
        List<ProductResponseDTO> responseDTOs = new ArrayList<>();
        allProducts.forEach(product -> {
            responseDTOs.add(product.productResponseDTO());
        });
        return new ResponseEntity<>(responseDTOs, HttpStatus.OK);
    }
    @PostMapping(path = "/add")
    public ResponseEntity<ProductResponseDTO> postProduct(Product product)
    {
        Product productAdded = productService.addProduct(product.getName(), product.getDescription(), product.getPrice(), product.getImageUrl(), product.getCategory().getName());
        return new ResponseEntity<>(productAdded.productResponseDTO(), HttpStatus.CREATED);
    }

}
