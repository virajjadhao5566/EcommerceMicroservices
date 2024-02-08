package com.ecommmerce.ProductService.service;

import com.ecommmerce.ProductService.model.ProductRequest;
import com.ecommmerce.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long id);
}
