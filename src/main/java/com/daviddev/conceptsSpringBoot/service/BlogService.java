package com.daviddev.conceptsSpringBoot.service;

import com.daviddev.conceptsSpringBoot.domain.Article;
import com.daviddev.conceptsSpringBoot.domain.User;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    public String indexAticle(){
        return "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley";
    }

    public String postArticle(User user){
        String name = user.getName();
        String email = user.getEmail();
        Article article = user.getArticle();

        return "User: " + name + ", Email: " + email + ", " + article.describeArticle();
    }
}
