package com.kunwar.product.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kunwar.product.model.Product;
import com.kunwar.product.repository.ProductWrapper;

import java.util.List;

@Service
public class JsonService {

    private final RestTemplate restTemplate;

    public JsonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Product> fetchJsonData(String url) {
        ProductWrapper wrapper = restTemplate.getForObject(url, ProductWrapper.class);
        return wrapper.getProducts();
    }
}
