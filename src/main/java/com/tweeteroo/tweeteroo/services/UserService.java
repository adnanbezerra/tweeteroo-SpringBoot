package com.tweeteroo.tweeteroo.services;

import com.tweeteroo.tweeteroo.dto.NewUserDTO;
import com.tweeteroo.tweeteroo.model.Users;
import com.tweeteroo.tweeteroo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void save(NewUserDTO req) {
        repository.save(new Users(req));
    }
}
