package com.tmf.rew.WebApplication.SpringBankApplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmf.rew.WebApplication.SpringBankApplication.entities.TransactionEntity;
import com.tmf.rew.WebApplication.SpringBankApplication.repositories.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	TransactionRepository transactionrepo;
	
    public void makeTransaction(String fromAccount, String toAccount, Double amount) {
        System.out.println("Transaction: " + amount + " from " + fromAccount + " to " + toAccount);
  
	    TransactionEntity transactionentity= new TransactionEntity();
	    transactionentity.setAmount(amount);
	    transactionentity.setFromAccount(fromAccount);
	    transactionentity.setToAccount(toAccount);
	    transactionentity.setType(toAccount);
	    transactionrepo.save(transactionentity);
	             
    
    }

    public void viewTransactions(Long userId) {
        System.out.println("Viewing transactions for user ID: " + userId);
    }
}
