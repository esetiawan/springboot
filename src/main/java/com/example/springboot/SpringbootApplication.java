package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootApplication {
    @Autowired
    ReviewRepository reviewRepository;

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);
    }

    @GetMapping("/review")
    public List<Review> getAll() {
        return reviewRepository.findAll();
    }
}
