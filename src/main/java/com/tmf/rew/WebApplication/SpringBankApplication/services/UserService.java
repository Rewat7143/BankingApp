package com.tmf.rew.WebApplication.SpringBankApplication.services;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void register(String username, String password) {
        System.out.println("Registering user: " + username);
        // Logic to save user (to be added later)
    }

    public boolean login(String username, String password) {
        System.out.println("Logging in user: " + username);
        // Fake login logic
        return true;
    }
}
