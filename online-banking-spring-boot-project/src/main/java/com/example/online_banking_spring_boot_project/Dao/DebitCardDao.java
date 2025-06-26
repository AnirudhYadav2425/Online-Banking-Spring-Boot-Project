package com.example.online_banking_spring_boot_project.Dao;

import com.example.online_banking_spring_boot_project.Entity.DebitCard;

public interface DebitCardDao {

	DebitCard saveDebitCardDao(DebitCard card);

	DebitCard getDebitCardByCardNumberDao(Long cardNumber);

}
