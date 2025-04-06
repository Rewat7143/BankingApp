package com.tmf.rew.WebApplication.SpringBankApplication.repositories;

import com.tmf.rew.WebApplication.SpringBankApplication.entities.UserAccountDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountDetailsRepository extends JpaRepository<UserAccountDetailsEntity, Long> {
}
