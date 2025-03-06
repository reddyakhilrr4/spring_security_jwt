package com.example.spring_security_jwt.controller;

import com.example.spring_security_jwt.model.User;
import com.example.spring_security_jwt.service.JwtUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    // A simple login endpoint
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        // Verify user credentials (this should be done with a service and proper authentication)
        if (user.getUsername().equals("admin") && user.getPassword().equals("password")) {
            return jwtUtil.generateToken(user.getUsername());
        }
        return "Invalid credentials";
    }

    // A simple registration endpoint (just a demo, do not use like this in production)
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        // Register user logic
        return "User registered";
    }
}
