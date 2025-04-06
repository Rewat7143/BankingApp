package com.tmf.rew.WebApplication.SpringBankApplication.controller;

import com.tmf.rew.WebApplication.SpringBankApplication.entities.UserEntity;
import com.tmf.rew.WebApplication.SpringBankApplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserLoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String loginUser(@RequestParam String username,
                            @RequestParam String password,
                            Model model) {

        UserEntity user = userRepository.findByUsernameAndPassword(username, password);
        
        if (user != null) {
            // Success: redirect to dashboard
            return "dashboard";  // or redirect:/dashboard if it's mapped
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
