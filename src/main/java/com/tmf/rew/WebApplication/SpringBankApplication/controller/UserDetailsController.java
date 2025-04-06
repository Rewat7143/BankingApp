package com.tmf.rew.WebApplication.SpringBankApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserDetailsController {

    @GetMapping("/profile")
    public String viewProfile() {
        return "profile";
    }

    @GetMapping("/editprofile")
    public String editProfile() {
        return "editprofile";
    }
}
