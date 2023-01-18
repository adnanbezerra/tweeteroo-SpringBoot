package com.tweeteroo.tweeteroo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweeteroo.tweeteroo.model.Tweets;

public interface TweetRepository extends JpaRepository<Tweets, Long> {
}
