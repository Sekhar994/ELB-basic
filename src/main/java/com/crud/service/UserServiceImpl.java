package com.crud.service;

import com.crud.model.User;
import com.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository repository;


    public User addUser(User user){
        return repository.save(user);
    }

    public Optional<User> viewUserId(int id){
        return repository.findById(id);
    }

    public List<User> viewUser(){
        return repository.findAll();
    }
}
