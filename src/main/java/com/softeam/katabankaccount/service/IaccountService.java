package com.softeam.katabankaccount.service;

import com.softeam.katabankaccount.entity.BankAccountDTO;
import com.softeam.katabankaccount.exception.BusinessException;
import com.softeam.katabankaccount.exception.InvalidTransactionException;

public interface IaccountService {
	
	public BankAccountDTO getAccount(int Account_id) throws BusinessException;
	
	/**
	 * @param Account_id
	 * @param newAmont
	 *  methode pour mettre à jour le nouveau montant
	 */
	public void saveAmont(int Account_id,double newAmont) throws InvalidTransactionException;

}
