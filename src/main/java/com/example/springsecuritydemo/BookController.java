package com.example.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/")
    public String home() {
        return "Home";
    }

    @GetMapping("/books")
    public String books() {
        return "List of books.";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome admin";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome user";
    }

}
