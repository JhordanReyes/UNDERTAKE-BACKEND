package com.jhordan.backend.undertake.backend.services;

import java.util.List;
import java.util.Optional;

import com.jhordan.backend.undertake.backend.models.entities.Product;

public interface ProductService {
    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    void remove(Long id);
}
