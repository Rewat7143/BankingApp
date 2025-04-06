package com.tmf.rew.WebApplication.SpringBankApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewBankDetailsController {

    @GetMapping("/bankaccounts")
    public String viewBankAccounts() {
        return "bankaccounts";
    }
}
