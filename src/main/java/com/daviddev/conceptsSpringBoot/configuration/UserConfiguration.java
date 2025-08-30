package com.daviddev.conceptsSpringBoot.configuration;

import com.daviddev.conceptsSpringBoot.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean
    public UserRepository userRepository(){
        return new UserRepository();
    }
}
