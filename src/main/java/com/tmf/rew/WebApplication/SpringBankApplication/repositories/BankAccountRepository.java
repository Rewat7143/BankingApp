package com.tmf.rew.WebApplication.SpringBankApplication.repositories;

import com.tmf.rew.WebApplication.SpringBankApplication.entities.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {
	List<BankAccountEntity> findByBankName(String bankName);}
