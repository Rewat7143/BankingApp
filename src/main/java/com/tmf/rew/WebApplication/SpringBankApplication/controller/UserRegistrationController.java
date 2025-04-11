package com.tmf.rew.WebApplication.SpringBankApplication.controller;

import com.tmf.rew.WebApplication.SpringBankApplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }
    
    

    @PostMapping("/registerUser")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        userService.register(username, password);
        return "login";
    }
}
