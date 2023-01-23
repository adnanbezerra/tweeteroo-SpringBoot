package com.tweeteroo.tweeteroo.model;

import com.tweeteroo.tweeteroo.dto.NewUserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

@Data
@Entity
@NoArgsConstructor
public class Users {

  public Users(NewUserDTO newUser) {
    this.username = newUser.username();
    this.avatar = newUser.avatar();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 20)
  @NotNull
  private String username;

  @Column(length = 244)
  @NotNull
  @URL
  private String avatar;
}
