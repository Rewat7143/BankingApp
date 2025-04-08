package com.tmf.rew.WebApplication.SpringBankApplication.controller;

import com.tmf.rew.WebApplication.SpringBankApplication.entities.UserEntity;
import com.tmf.rew.WebApplication.SpringBankApplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserLoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // This corresponds to /WEB-INF/jsp/login.jsp
    }
    
    @PostMapping("/login")
    public String loginUser(@RequestParam String username,
                            @RequestParam String password,
                            Model model) {

        // Find the user by username
        UserEntity user = userRepository.findByUsername(username);
        
        // Compare the plain-text password (direct comparison)
        if (user != null && user.getPassword().equals(password)) {
            // Password matches, redirect to dashboard
            return "dashboard";  // Redirect to the dashboard
        } else {
            // Invalid username or password
            model.addAttribute("error", "Invalid username or password");
            return "login";  // Redirect back to login page
        }
    }
}
