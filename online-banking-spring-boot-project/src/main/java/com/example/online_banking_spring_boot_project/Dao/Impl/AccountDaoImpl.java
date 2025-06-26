package com.example.online_banking_spring_boot_project.Dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.online_banking_spring_boot_project.Dao.AccountDao;
import com.example.online_banking_spring_boot_project.Entity.Account;
import com.example.online_banking_spring_boot_project.Repository.AccountRepository;

@Repository
public class AccountDaoImpl implements AccountDao{
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account saveAccountDao(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Account findAccountByAccountNumber(Long accountNumber) {
		return accountRepository.findByAccountNumber(accountNumber);
	}
}
