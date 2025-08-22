package com.daviddev.conceptsSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public String helloHome() {
        return "Welcome to my HomePage";
    }

    public String secondPage() {
        return "Welcome to my second page!";
    }
}
