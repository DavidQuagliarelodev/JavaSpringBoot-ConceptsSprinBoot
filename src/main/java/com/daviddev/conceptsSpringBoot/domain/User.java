package com.daviddev.conceptsSpringBoot.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class User {
    private String name;
    private String email;
    private Article article;

    public User(String name, String email, Article article) {
        this.name = name;
        this.email = email;
        this.article = article;
    }
}
