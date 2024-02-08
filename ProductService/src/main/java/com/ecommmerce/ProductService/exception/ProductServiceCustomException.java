package com.ecommmerce.ProductService.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductServiceCustomException extends RuntimeException{
    private String errorCode;
    public ProductServiceCustomException(String message,String errorCode){
        super(message);
        this.errorCode = errorCode;
    }
}
