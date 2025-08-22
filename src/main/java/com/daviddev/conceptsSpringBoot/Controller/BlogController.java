package com.daviddev.conceptsSpringBoot.Controller;

import com.daviddev.conceptsSpringBoot.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {
    private BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }
    @GetMapping
    public String indedArticle(){
        return blogService.indexAticle();
    }
}
