package com.practice.ProductService.Services;

import com.practice.ProductService.dtos.FakeStoreProductDTO;
import com.practice.ProductService.dtos.FakeStoreProductRequestDTO;
import com.practice.ProductService.dtos.ProductResponseDTO;
import com.practice.ProductService.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Qualifier("fakeProductService")
public class FakeStoreProductService implements ProductService {
    RestTemplate restTemplate;

    FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = new RestTemplate();
    }

    public Product getProductById(int id) {
        String url = "https://fakestoreapi.com/products/" + id;
        return restTemplate.getForObject(url, FakeStoreProductDTO.class).toProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        String url = "https://fakestoreapi.com/products";
        FakeStoreProductDTO[] fakeStoreProducts = restTemplate.getForObject(url, FakeStoreProductDTO[].class);
        List<Product> products= new ArrayList<>();
        Arrays.stream(fakeStoreProducts).map(FakeStoreProductDTO::toProduct).forEach(products::add);
        return products;
    }

    @Override
    public Product addProduct(String name, String description, double price, String imageUrl, String category) {
        FakeStoreProductRequestDTO requestDTO = FakeStoreProductRequestDTO.builder()
                .title(name)
                .description(description)
                .price(price)
                .image(imageUrl)
                .category(category)
                .build();
        String url = "https://fakestoreapi.com/products";
        FakeStoreProductDTO fakeStoreProductDTO = restTemplate.postForObject(url, requestDTO, FakeStoreProductDTO.class);
        System.out.println(fakeStoreProductDTO.toString());
        return fakeStoreProductDTO.toProduct();
    }
}
