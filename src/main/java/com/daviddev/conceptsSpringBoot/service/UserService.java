package com.daviddev.conceptsSpringBoot.service;
import com.daviddev.conceptsSpringBoot.configuration.UserConfiguration;
import com.daviddev.conceptsSpringBoot.domain.User;
import com.daviddev.conceptsSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    private UserRepository fakeRepository;


    public ArrayList<String> getUsers(){
        return this.fakeRepository.getUsers();
    }

    public String getUserById(int id){
        return this.fakeRepository.getUserById(id);
    }

    public void postUser(User user){
        this.fakeRepository.postUser(user);
    }
}
