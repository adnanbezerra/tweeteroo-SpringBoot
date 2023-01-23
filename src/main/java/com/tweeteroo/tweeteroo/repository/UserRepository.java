package com.tweeteroo.tweeteroo.repository;

import com.tweeteroo.tweeteroo.model.Tweets;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tweeteroo.tweeteroo.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
