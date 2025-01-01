package com.kunwar.product.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.kunwar.product.model.Product;
import com.kunwar.product.model.Review;
import com.kunwar.product.service.ProductSearchService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductSearchService productSearchService;

    public ProductController(ProductSearchService productSearchService) {
        this.productSearchService = productSearchService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> search(@RequestParam String keyword) {
        List<Product> products = productSearchService.searchProducts(keyword);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/searchById")
    public ResponseEntity<Product> search(@RequestParam Long id) {
        Product product = productSearchService.searchProductsById(id).orElse(null);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/review")
    public ResponseEntity<List<Review>> getProductReviews(@RequestParam List<Long> ids) {
        List<Review> reviews = productSearchService.getReviewsByIds(ids);
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }
}
