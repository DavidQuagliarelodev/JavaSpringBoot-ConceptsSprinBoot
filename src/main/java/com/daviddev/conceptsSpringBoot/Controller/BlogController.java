package com.daviddev.conceptsSpringBoot.Controller;

import com.daviddev.conceptsSpringBoot.domain.User;
import com.daviddev.conceptsSpringBoot.service.BlogService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {
    //o @Autowired resumiu tudo que eu fiz no HomeController como apenas uma linha
    @Autowired
    private BlogService blogService;

//    public BlogController(BlogService blogService) {
//        this.blogService = blogService;
//    }
    @GetMapping
    public String indexArticle(){
        return blogService.indexAticle();
    }

    @PostMapping("/postaticle")
    public String postArticle(@RequestBody User user){
            return blogService.postArticle(user);

    }
}
