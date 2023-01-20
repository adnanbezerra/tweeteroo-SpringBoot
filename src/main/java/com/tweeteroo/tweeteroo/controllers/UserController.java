package com.tweeteroo.tweeteroo.controllers;

import com.tweeteroo.tweeteroo.dto.NewUserDTO;

import com.tweeteroo.tweeteroo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sign-up")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public void signup(@RequestBody NewUserDTO req) {
        service.save(req);
    }

}
