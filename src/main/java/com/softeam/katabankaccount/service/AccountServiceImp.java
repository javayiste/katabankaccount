package com.softeam.katabankaccount.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softeam.katabankaccount.constants.Constants;
import com.softeam.katabankaccount.entity.BankAccountDTO;
import com.softeam.katabankaccount.persistence.IaccountDAO;
import com.softeam.katabankaccount.exception.BusinessException;
import com.softeam.katabankaccount.exception.InvalidTransactionException;

/**
 * @author Morad MELSAOUI
 *
 */

@Service
@Transactional(rollbackFor = InvalidTransactionException.class)
public class AccountServiceImp implements IaccountService {
	
	@Autowired
	IaccountDAO accountDAO;
	
	@Override
	public BankAccountDTO getAccount(int Account_id) throws BusinessException
	{
		BankAccountDTO bankAccountdto = accountDAO.getListAccount().get(Account_id);
		if(bankAccountdto == null)
		{
			throw new BusinessException(Constants.MSG_ACCOUNT_NOT_FOUND_EXCEPTION);
		}
		return accountDAO.getListAccount().get(Account_id);
	}
	
	@Override
	public void saveAmont(int Account_id,double newAmont) throws InvalidTransactionException
	{
		BankAccountDTO bankAccountdto = accountDAO.getListAccount().get(Account_id);
		if(bankAccountdto == null)
		{
			throw new InvalidTransactionException(Constants.MSG_ACCOUNT_NOT_FOUND_EXCEPTION);
		}
		bankAccountdto.setAmount(newAmont);
		accountDAO.saveAccount(bankAccountdto);
	}
	
}
