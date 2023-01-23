package com.tweeteroo.tweeteroo.model;

import com.tweeteroo.tweeteroo.dto.NewTweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweets {

  public Tweets(NewTweetDTO newTweet, String avatar) {
    this.tweet = newTweet.tweet();
    this.username = newTweet.username();
    this.avatar = avatar;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 240)
  @NotNull
  private String tweet;

  @Column(length = 20)
  @NotNull
  private String username;

  @Column(length = 100)
  @NotNull
  private String avatar;
}
