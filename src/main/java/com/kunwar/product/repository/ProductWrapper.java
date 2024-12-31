package com.kunwar.product.repository;

import java.util.List;

import com.kunwar.product.model.Product;

public class ProductWrapper {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
