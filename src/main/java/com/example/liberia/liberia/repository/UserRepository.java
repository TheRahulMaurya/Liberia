package com.example.liberia.liberia.repository;

import com.example.liberia.liberia.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
