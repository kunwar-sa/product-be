package com.kunwar.product.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kunwar.product.model.Product;

import com.kunwar.product.repository.ProductRepository;

import java.util.List;

@Service
@Repository
public class DatabaseService {

    private final ProductRepository repository;

    public DatabaseService(ProductRepository repository) {
        this.repository = repository;
    }

    public void saveData(List<Product> data) {
        repository.saveAll(data);
    }

}
