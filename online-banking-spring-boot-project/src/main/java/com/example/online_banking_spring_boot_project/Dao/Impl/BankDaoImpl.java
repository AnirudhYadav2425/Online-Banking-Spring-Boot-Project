package com.example.online_banking_spring_boot_project.Dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.online_banking_spring_boot_project.Dao.BankDao;
import com.example.online_banking_spring_boot_project.Entity.Bank;
import com.example.online_banking_spring_boot_project.Repository.BankRepository;

import jakarta.persistence.EntityNotFoundException;

@Repository
public class BankDaoImpl implements BankDao {
	@Autowired
	private BankRepository bankRepository;

	@Override
	public Bank saveBankDao(Bank bank) {
		return bankRepository.save(bank);
	}

	@Override
	public Bank findBankByIdDao(Integer bankId) {
		return bankRepository.findById(bankId).orElseThrow(() -> new EntityNotFoundException("given id is not found" + bankId));
	}

}
