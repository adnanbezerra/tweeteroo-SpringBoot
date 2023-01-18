package com.tweeteroo.tweeteroo.model;

import com.tweeteroo.tweeteroo.dto.NewTweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweets {

  public Tweets(NewTweetDTO newTweet) {
    this.tweet = newTweet.tweet();
    this.username = newTweet.username();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 240)
  private String tweet;

  @Column(length = 20)
  private String username;
}
