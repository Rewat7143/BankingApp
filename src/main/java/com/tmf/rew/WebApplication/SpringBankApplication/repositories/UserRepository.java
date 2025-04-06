package com.tmf.rew.WebApplication.SpringBankApplication.repositories;

import com.tmf.rew.WebApplication.SpringBankApplication.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsernameAndPassword(String username, String password);
}
