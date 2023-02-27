package com.ferdev.Sucurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
        System.out.println(new BCryptPasswordEncoder().encode("admin"));
    }

    @GetMapping("/")
    public String index() {
        return "Hello, you are in the index.";
    }
}
