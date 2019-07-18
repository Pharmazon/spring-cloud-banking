package ru.shcheglov.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Request token
 * POST http://localhost:8500/uaa/oauth/token?grant_type=password&username=account&password=account
 */

@SpringBootApplication
public class AuthService {

    public static void main(String[] args) {
        SpringApplication.run(AuthService.class, args);
    }
}
