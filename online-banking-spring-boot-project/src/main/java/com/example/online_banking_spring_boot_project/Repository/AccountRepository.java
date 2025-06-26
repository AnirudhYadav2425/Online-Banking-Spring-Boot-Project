package com.example.online_banking_spring_boot_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online_banking_spring_boot_project.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
	Account findByAccountNumber(Long accountNumber);

}
