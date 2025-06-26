package com.example.online_banking_spring_boot_project.Entity;

import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "transaction_seq_gen")
	@SequenceGenerator(name="transaction_seq_gen",sequenceName = "transaction_sequence", initialValue = 1000000,allocationSize = 1)
	private int transactionid;
	private String transactionType;
	private double amount;
	
	@UpdateTimestamp
	private LocalDate timestamp;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="accountid")
	private Account account;
}
