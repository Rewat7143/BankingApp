package com.tmf.rew.WebApplication.SpringBankApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBankApplication.class, args);
        System.out.println("BankApplication Started ✅");
    }
}

