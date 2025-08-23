package com.daviddev.conceptsSpringBoot.domain;

import lombok.Data;


public class Article {
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String describeArticle() {
        return "Title: " + this.title + ", Content: " + this.content;
    }

}
