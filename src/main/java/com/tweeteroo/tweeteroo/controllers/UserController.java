package com.tweeteroo.tweeteroo.controllers;

import com.tweeteroo.tweeteroo.dto.NewUserDTO;
import com.tweeteroo.tweeteroo.model.User;
import com.tweeteroo.tweeteroo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign-up")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public void signup(@RequestBody NewUserDTO req) {
        repository.save(new User(req));
    }

}
