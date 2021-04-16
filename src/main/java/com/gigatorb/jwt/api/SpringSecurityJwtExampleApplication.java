package com.gigatorb.jwt.api;

import com.gigatorb.jwt.api.entity.User;
import com.gigatorb.jwt.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {

    @Autowired
    private UserRepository userRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

    @PostConstruct
    public void initUser() {
        List<User> users = Arrays.asList(
                new User(101, "lavpandey", "password", "lav@lav.com"),
                new User(102, "adamsmith", "password123", "adamsmith@lav.com"),
                new User(103, "willsmith", "password456", "willsmith@lav.com"),
                new User(104, "stevesmith", "password789", "stevesmith@lav.com")
        );
        userRepo.saveAll(users);
    }
}
