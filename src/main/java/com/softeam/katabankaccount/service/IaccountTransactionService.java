package com.softeam.katabankaccount.service;

import java.time.LocalDate;
import java.util.List;

import com.softeam.katabankaccount.entity.AccountTransactionDTO;

public interface IaccountTransactionService {
	
	
	public double getSumTransactionByAccoutByDateByType(int accountId, LocalDate date, String typeTransaction);
	
	public List<AccountTransactionDTO> getHistoryTransactionByAccoutByDate(int accountId);

	

}
