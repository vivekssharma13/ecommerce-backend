package com.practice.ProductService.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {
    public String message;
    public int statusCode;
}
