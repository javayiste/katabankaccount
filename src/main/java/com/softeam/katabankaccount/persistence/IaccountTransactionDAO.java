package com.softeam.katabankaccount.persistence;

import java.time.LocalDate;
import java.util.List;

import com.softeam.katabankaccount.entity.AccountTransactionDTO;

public interface IaccountTransactionDAO {
	
	public List<AccountTransactionDTO> getTransactionByAccountByDateByType(int AccountID,LocalDate date , String typeTransaction);
	
	public List<AccountTransactionDTO> getTransactionByAccountByDate(int AccountID);
	

}
