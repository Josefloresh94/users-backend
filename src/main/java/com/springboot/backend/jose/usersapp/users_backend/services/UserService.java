package com.springboot.backend.jose.usersapp.users_backend.services;

import java.util.List;
import java.util.Optional;

import com.springboot.backend.jose.usersapp.users_backend.entities.User;

import io.micrometer.common.lang.NonNull;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(@NonNull Long id);

    User save(User user);

    void deleteById(Long id);
}
