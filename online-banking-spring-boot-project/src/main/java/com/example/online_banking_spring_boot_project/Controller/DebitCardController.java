package com.example.online_banking_spring_boot_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.online_banking_spring_boot_project.Dao.AccountDao;
import com.example.online_banking_spring_boot_project.Dao.DebitCardDao;
import com.example.online_banking_spring_boot_project.Entity.Account;
import com.example.online_banking_spring_boot_project.Entity.DebitCard;

@RestController
@RequestMapping(value = "/card")
public class DebitCardController {

	@Autowired
	private DebitCardDao cardDao;

	@Autowired
	private AccountDao accountDao;

	@PostMapping(value = "/saveCard/{accountId}")
	public DebitCard saveDebitCardController(@RequestBody DebitCard card,
			@PathVariable(value = "accountId") Long accountNumber) {
		Account account = accountDao.findAccountByAccountNumber(accountNumber);
		if (account != null) {
			card.setAccount(account);

			return cardDao.saveDebitCardDao(card);
		} else {
			return null;
		}
	}

	@GetMapping(value = "/getCardByCardNumber")
	public DebitCard getDebitCardByCardNumberController(@PathVariable(value = "cardNumber") Long cardNumber) {
		return cardDao.getDebitCardByCardNumberDao(cardNumber);
	}

}
