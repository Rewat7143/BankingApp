package com.tmf.rew.WebApplication.SpringBankApplication.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="transaction_entity")
public class TransactionEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="amount")
    private Double amount;
    @Column(name="type")
    private String type;
    @Column(name="date")
    private LocalDateTime date;
    @Column(name="fromAccount")
    private String fromAccount;
    @Column(name="toAccount")
    private String toAccount;
	
 // Getters and Setters

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

        
}
