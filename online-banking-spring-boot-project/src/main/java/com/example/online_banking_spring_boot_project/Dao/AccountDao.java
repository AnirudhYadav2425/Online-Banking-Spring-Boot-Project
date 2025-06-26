package com.example.online_banking_spring_boot_project.Dao;

import com.example.online_banking_spring_boot_project.Entity.Account;

public interface AccountDao {
	
	Account saveAccountDao(Account account);
	
	Account findAccountByAccountNumber(Long accountNumber);
}
