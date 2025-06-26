package com.example.online_banking_spring_boot_project.Dao.Impl;

import org.springframework.stereotype.Repository;

import com.example.online_banking_spring_boot_project.Dao.DebitCardDao;
import com.example.online_banking_spring_boot_project.Entity.DebitCard;
import com.example.online_banking_spring_boot_project.Repository.DebitCareRepository;

import jakarta.persistence.EntityNotFoundException;

@Repository
public class DebitCardDaoImpl implements DebitCardDao {
	

	private DebitCareRepository cardRepository;
	
	@Override
	public DebitCard saveDebitCardDao(DebitCard card)
	{
		return cardRepository.save(card);
	}

	public DebitCard getDebitCardByCardNumberDao(Long cardNumber)
	{
		return cardRepository.findById(cardNumber).orElseThrow(()->new EntityNotFoundException("card not found"+cardNumber));
	}

}
