package com.tmf.rew.WebApplication.SpringBankApplication.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String testPage() {
        return "test"; // This will load test.jsp
    }
}

