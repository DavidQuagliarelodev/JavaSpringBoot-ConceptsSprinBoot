package com.daviddev.conceptsSpringBoot.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class User {
    private int id;
    private String name;
    private String email;
}
