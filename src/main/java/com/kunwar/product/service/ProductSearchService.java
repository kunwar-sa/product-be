package com.kunwar.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kunwar.product.model.Product;
import com.kunwar.product.model.Review;
import com.kunwar.product.repository.ProductRepository;
import com.kunwar.product.repository.ReviewRepository;

@Service
public class ProductSearchService {

    private final ProductRepository productRepository;

    @Autowired
    private final ReviewRepository reviewRepository;

    public ProductSearchService(ProductRepository productRepository, ReviewRepository reviewRepository) {
        this.productRepository = productRepository;
        this.reviewRepository = reviewRepository;
    }

    public List<Product> searchProducts(String keyword) {
        return productRepository.searchByKeyword(keyword);
    }

    public Optional<Product> searchProductsById(Long id) {
        return productRepository.findById(id);
    }

    public List<Review> getReviewsByIds(List<Long> ids) {
        return reviewRepository.findByIdIn(ids);
    }
}
