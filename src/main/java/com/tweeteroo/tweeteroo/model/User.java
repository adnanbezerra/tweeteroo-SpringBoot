package com.tweeteroo.tweeteroo.model;

import com.tweeteroo.tweeteroo.dto.NewUserDTO;

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
public class User {

  public User(NewUserDTO newUser) {
    this.username = newUser.username();
    this.avatar = newUser.avatar();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 20)
  private String username;

  @Column(length = 244)
  private String avatar;
}
