package com.tmf.rew.WebApplication.SpringBankApplication.services;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    public void addBankAccount(String bankName, String accountNumber) {
        System.out.println("Bank Account added: " + bankName + " - " + accountNumber);
    }

    public void removeBankAccount(Long accountId) {
        System.out.println("Bank Account removed: ID " + accountId);
    }
}
