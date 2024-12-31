package com.kunwar.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kunwar.product.model.Product;
import com.kunwar.product.repository.ProductRepository;

@Service
public class ProductSearchService {

    private final ProductRepository productRepository;

    public ProductSearchService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> searchProducts(String keyword) {
        return productRepository.searchByKeyword(keyword);
    }
}
