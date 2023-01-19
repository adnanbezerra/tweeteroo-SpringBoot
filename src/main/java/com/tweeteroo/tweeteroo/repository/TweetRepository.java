package com.tweeteroo.tweeteroo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweeteroo.tweeteroo.model.Tweets;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweets, Long> {
    public List<Tweets> findByUsername(String username);
}
