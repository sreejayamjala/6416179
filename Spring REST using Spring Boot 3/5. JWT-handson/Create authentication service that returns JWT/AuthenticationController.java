package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {

    private final String SECRET_KEY = "secret"; // Change this in real apps

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length()).trim();
            byte[] decoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(decoded);

            String[] values = credentials.split(":", 2);
            String username = values[0];
            String password = values[1];
            System.out.println("Username: " + username + ", Password: " + password);


            if ("user".equals(username) && "pwd".equals(password)) {
                String token = Jwts.builder()
                        .setSubject(username)
                        .setIssuedAt(new Date())
                        .setExpiration(new Date(System.currentTimeMillis() + 600000)) 
                        .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                        .compact();

                Map<String, String> response = new HashMap<>();
                response.put("token", token);
                return response;
            }
        }

        throw new RuntimeException("Invalid Credentials");
    }
}
