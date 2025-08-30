package com.daviddev.conceptsSpringBoot.repository;

import com.daviddev.conceptsSpringBoot.domain.User;

import java.util.ArrayList;
import java.util.List;


public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void postUser(User user){
        this.users.add(user);
    }

    public ArrayList<String> getUsers(){
        ArrayList<String>namesUsers = new ArrayList<>();
        int count = 0;
        for(User us : this.users){
            if(us.getName() == users.get(count).getName()){
                namesUsers.add(us.getName());
            }
            count++;
        }
        return namesUsers;
    }

    public String getUserById(int id){
        String namesUser = "";
        int count = 0;
        for(User us : this.users){
            if(us.getId() == id){
                namesUser = us.getName();
            }
            count++;
        }
        return namesUser;
    }
}
