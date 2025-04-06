package com.tmf.rew.WebApplication.SpringBankApplication.services;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public void makeTransaction(String fromAccount, String toAccount, Double amount) {
        System.out.println("Transaction: " + amount + " from " + fromAccount + " to " + toAccount);
    }

    public void viewTransactions(Long userId) {
        System.out.println("Viewing transactions for user ID: " + userId);
    }
}
