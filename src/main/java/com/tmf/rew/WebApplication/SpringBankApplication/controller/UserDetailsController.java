package com.tmf.rew.WebApplication.SpringBankApplication.controller;

import com.tmf.rew.WebApplication.SpringBankApplication.entities.UserEntity;
import com.tmf.rew.WebApplication.SpringBankApplication.entities.BankAccountEntity;
import com.tmf.rew.WebApplication.SpringBankApplication.entities.TransactionEntity;
import com.tmf.rew.WebApplication.SpringBankApplication.repositories.UserRepository;
import com.tmf.rew.WebApplication.SpringBankApplication.repositories.BankAccountRepository;
import com.tmf.rew.WebApplication.SpringBankApplication.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserDetailsController {

    // Autowired repositories
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    // View Profile Page
    @GetMapping("/profile")
    public String viewProfile(HttpSession session, Model model) {
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "redirect:/login";  // Redirect if not logged in
        }

        // Fetch user details from repository
        UserEntity user = userRepository.findByUsername(username);
        model.addAttribute("user", user);

        return "profile";  // JSP page for user profile
    }

    // Edit Profile Page
    @GetMapping("/editprofile")
    public String editProfile(HttpSession session, Model model) {
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "redirect:/login";  // Redirect if not logged in
        }

        // Fetch user details for editing
        UserEntity user = userRepository.findByUsername(username);
        model.addAttribute("user", user);

        return "editprofile";  // JSP page for editing profile
    }

    // Save Updated Profile
    @PostMapping("/updateProfile")
    public String updateProfile(@RequestParam String email,
                                @RequestParam String address,
                                HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "redirect:/login";  // Redirect if not logged in
        }

        // Fetch user and update details
        UserEntity user = userRepository.findByUsername(username);
        user.setEmail(email);
        user.setAddress(address);
        userRepository.save(user);  // Save updated user to DB

        return "redirect:/profile";  // Redirect to profile page after update
    }

    // View Bank Accounts Page
    @GetMapping("/bankAccounts")
    public String viewBankAccounts(HttpSession session, Model model) {
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "redirect:/login";  // Redirect if not logged in
        }

        // Fetch user's bank accounts
        List<BankAccount> accounts = bankAccountRepository.findByUserUsername(username);
        model.addAttribute("accounts", accounts);

        return "bankAccounts";  // JSP page for viewing bank accounts
    }

    // Add Bank Account Page
    @GetMapping("/addBankAccount")
    public String showAddBankAccountPage() {
        return "addBankAccount";  // JSP page for adding a new bank account
    }

    // Save New Bank Account
    @PostMapping("/saveBankAccount")
    public String saveBankAccount(@RequestParam String accountName,
                                  @RequestParam Double balance,
                                  HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "redirect:/login";  // Redirect if not logged in
        }

        // Save new bank account
        BankAccount newAccount = new BankAccount(username, accountName, balance);
        bankAccountRepository.save(newAccount);  // Save to DB

        return "redirect:/bankAccounts";  // Redirect to bank accounts page after saving
    }

    // View Transaction History
    @GetMapping("/transactions")
    public String viewTransactions(HttpSession session, Model model) {
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "redirect:/login";  // Redirect if not logged in
        }

        // Fetch user transactions
        List<TransactionEntity> transactions = transactionRepository.findByUserUsername(username);
        model.addAttribute("transactions", transactions);

        return "transactions";  // JSP page for viewing transactions
    }
}
