package com.jhordan.backend.undertake.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jhordan.backend.undertake.backend.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
