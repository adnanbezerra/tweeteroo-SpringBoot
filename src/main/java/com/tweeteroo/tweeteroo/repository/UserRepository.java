package com.tweeteroo.tweeteroo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweeteroo.tweeteroo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
