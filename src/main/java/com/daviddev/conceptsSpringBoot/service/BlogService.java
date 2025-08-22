package com.daviddev.conceptsSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class BlogService {
    public String indexAticle(){
        return "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley";
    }
}
