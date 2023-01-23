package com.tweeteroo.tweeteroo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweeteroo.tweeteroo.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);
}
