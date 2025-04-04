package com.WebApplication.BankingApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/testPage")
    public String testPage() {
        return "test";  // This will redirect to test.jsp
    }
}
