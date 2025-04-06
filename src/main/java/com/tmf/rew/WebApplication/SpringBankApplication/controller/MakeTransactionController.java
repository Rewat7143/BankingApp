package com.tmf.rew.WebApplication.SpringBankApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MakeTransactionController {

    @GetMapping("/sendmoney")
    public String sendMoney() {
        return "sendmoney";
    }
}
