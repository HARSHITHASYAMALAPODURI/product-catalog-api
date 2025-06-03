package com.catalog.service;

import com.catalog.model.Product;
import com.catalog.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product save(Product product) {
        return repo.save(product);
    }

    public Optional<Product> findById(Long id) {
        return repo.findById(id);
    }

    public List<Product> findAll() {
        return repo.findAll();
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    public List<Product> filterByCategory(String category) {
        return repo.findByCategory(category);
    }

    public List<Product> filterByPriceRange(BigDecimal min, BigDecimal max) {
        return repo.findByPriceBetween(min, max);
    }

    public List<Product> searchByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }
}
