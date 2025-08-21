package com.daviddev.conceptsSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String helloHome(){
        return "Hello World my HomePage";
    }

    @GetMapping("/secondpage")
    public String secondPage(){
        return "Welcome my second page !";
    }
}
