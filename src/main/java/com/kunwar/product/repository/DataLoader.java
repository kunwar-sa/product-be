package com.kunwar.product.repository;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kunwar.product.model.Product;
import com.kunwar.product.service.DatabaseService;
import com.kunwar.product.service.JsonService;

@Component
public class DataLoader implements CommandLineRunner {

    private final JsonService jsonService;
    private final DatabaseService databaseService;

    public DataLoader(JsonService jsonService, DatabaseService databaseService) {
        this.jsonService = jsonService;
        this.databaseService = databaseService;
    }

    @Override
    public void run(String... args) throws Exception {
        String url = "https://dummyjson.com/products"; // Replace with your URL
        List<Product> data = jsonService.fetchJsonData(url);
        databaseService.saveData(data);
        System.out.println("Data loaded into H2 database!");
    }
}
