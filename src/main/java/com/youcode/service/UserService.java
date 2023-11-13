package com.youcode.service;

import com.youcode.entities.User;
import com.youcode.repository.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
    public void saveUser(User user){
        userRepository.save(user);
    }
}
