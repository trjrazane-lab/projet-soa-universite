package com.example.authservice.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class AuthController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody LoginRequest request) {

        if ("admin".equals(request.getUsername()) &&
            "1234".equals(request.getPassword())) {

            return Map.of("token", "FAKE-JWT-TOKEN-12345");
        }

        throw new RuntimeException("Invalid credentials");
    }
}



