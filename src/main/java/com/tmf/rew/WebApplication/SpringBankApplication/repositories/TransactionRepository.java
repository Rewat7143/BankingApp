// TransactionRepository.java
package com.tmf.rew.WebApplication.SpringBankApplication.repositories;

import com.tmf.rew.WebApplication.SpringBankApplication.entities.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
  //List<TransactionEntity> findByUserUsername(String username);
}
