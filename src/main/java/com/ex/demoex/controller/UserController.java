package com.ex.demoex.controller;


import com.ex.demoex.models.Location;
import com.ex.demoex.models.User;
import com.ex.demoex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping(value = "/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();

    }

    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable("id") String id){

        return userService.getUser(id);
    }
}