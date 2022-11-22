package com.crud.controller;

import com.crud.model.User;
import com.crud.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return service.addUser(user);
    }

    @GetMapping("/view/{id}")
    public Optional<User> viewUserId(@PathVariable("id") int id){
        return service.viewUserId(id);
    }

    @GetMapping("/viewall")
    public List<User> viewUser(){
        return service.viewUser();
    }
}
