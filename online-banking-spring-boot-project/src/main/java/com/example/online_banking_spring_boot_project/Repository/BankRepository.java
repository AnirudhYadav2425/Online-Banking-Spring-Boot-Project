package com.example.online_banking_spring_boot_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online_banking_spring_boot_project.Entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

}
