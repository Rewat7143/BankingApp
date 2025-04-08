	package com.tmf.rew.WebApplication.SpringBankApplication.services;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
	import com.tmf.rew.WebApplication.SpringBankApplication.entities.UserEntity;
	import com.tmf.rew.WebApplication.SpringBankApplication.repositories.UserRepository;
	
	@Service
	public class UserService {
		@Autowired
		UserRepository userrepo;
	    public void register(String username, String password) {
	        System.out.println("Registering user: " + username);
	        
	       UserEntity userentity= new UserEntity();
	       userentity.setUsername(username);
	       userentity.setPassword(password);
	        userrepo.save(userentity);
	    }
	
	    public boolean login(String username, String password) {
	        System.out.println("Logging in user: " + username);
	        return true;
	    }
	}
