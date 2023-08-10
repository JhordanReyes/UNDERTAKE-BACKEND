package com.jhordan.backend.undertake.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jhordan.backend.undertake.backend.models.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
    
}
