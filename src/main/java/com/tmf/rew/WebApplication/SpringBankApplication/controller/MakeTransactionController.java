package com.tmf.rew.WebApplication.SpringBankApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tmf.rew.WebApplication.SpringBankApplication.repositories.UserRepository;

@Controller
public class MakeTransactionController {

	
	@Autowired
    private UserRepository TransactionRepository;

    @GetMapping("/sendmoney")
    public String sendMoney() {
        return "sendmoney";
    }
}
