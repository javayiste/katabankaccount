package com.softeam.katabankaccount.persistence;

import java.util.List;

import com.softeam.katabankaccount.entity.BankAccountDTO;

public interface IaccountDAO {
	
	public List<BankAccountDTO> getListAccount();
	
	public void saveAccount(BankAccountDTO bankAccountDTO);

}
