package com.example.online_banking_spring_boot_project.Dao;

import com.example.online_banking_spring_boot_project.Entity.Bank;

public interface BankDao {

	Bank saveBankDao(Bank bank);

	Bank findBankByIdDao(Integer bankId);
}