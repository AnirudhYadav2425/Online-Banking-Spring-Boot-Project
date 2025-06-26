package com.example.online_banking_spring_boot_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online_banking_spring_boot_project.Entity.DebitCard;

public interface DebitCareRepository extends JpaRepository<DebitCard, Long> {
	DebitCard findById(Integer cardNumber);
	

}
