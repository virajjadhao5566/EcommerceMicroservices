package com.ecommmerce.ProductService.service;

import com.ecommmerce.ProductService.entity.ProductEntity;
import com.ecommmerce.ProductService.exception.ProductServiceCustomException;
import com.ecommmerce.ProductService.model.ProductRequest;
import com.ecommmerce.ProductService.model.ProductResponse;
import com.ecommmerce.ProductService.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public long addProduct(ProductRequest productRequest) {
        log.info("Adding Product");
        ProductEntity product = ProductEntity.builder()
                .productName(productRequest.getProductName())
                .quantity(productRequest.getQuantity())
                .price(productRequest.getPrice()).build();
        productRepository.save(product);
        log.info("product created");
        return product.getProductId();
    }

    @Override
    public ProductResponse getProductById(long productId) {
        ProductEntity product = productRepository.findById(productId)
                .orElseThrow(() -> new ProductServiceCustomException("Product not Found","PRODUCT_NOT_FOUND"));
        ProductResponse productResponse = new ProductResponse();
        BeanUtils.copyProperties(product,productResponse);
        return productResponse;
    }
}
