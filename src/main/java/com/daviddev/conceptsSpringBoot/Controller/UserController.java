package com.daviddev.conceptsSpringBoot.Controller;

import com.daviddev.conceptsSpringBoot.domain.User;
import com.daviddev.conceptsSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserService userService;

    @GetMapping()
    public ArrayList<String> getUser(){
       return userService.getUsers();
    }

    @GetMapping("{id}")
    public String getUser(@PathVariable("id") int id){
        return userService.getUserById(id);
    }

    @PostMapping
    public void postUser(@RequestBody User user){
        userService.postUser(user);
    }
}
