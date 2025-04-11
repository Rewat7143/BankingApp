package com.tmf.rew.WebApplication.SpringBankApplication.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public void setEmail(String email) {
				
	}

	public void setAddress(String address) {
				
	}
}
