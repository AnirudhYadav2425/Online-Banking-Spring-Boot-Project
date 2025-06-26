package com.example.online_banking_spring_boot_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.online_banking_spring_boot_project.Dao.BankDao;
import com.example.online_banking_spring_boot_project.Entity.Bank;

@RestController
@RequestMapping(value = "/bank")
public class BankController {

	@Autowired
	private BankDao bankDao;
	
	@PostMapping(value = "/saveBank")
	public Bank saveBankController(@RequestBody Bank bank) {
		return bankDao.saveBankDao(bank);
	}

	@GetMapping(value = "/getBankById/{bankId}")
	public Bank findBankByIdDao(@PathVariable(name = "bankId") Integer bankId) {
		return bankDao.findBankByIdDao(bankId);
	}
}
