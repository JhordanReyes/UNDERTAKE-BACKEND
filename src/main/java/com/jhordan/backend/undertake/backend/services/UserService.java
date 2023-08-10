package com.jhordan.backend.undertake.backend.services;

import java.util.List;
import java.util.Optional;

import com.jhordan.backend.undertake.backend.models.entities.User;

public interface UserService {
    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void remove(Long id);
}
