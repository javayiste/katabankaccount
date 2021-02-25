package com.softeam.katabankaccount.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softeam.katabankaccount.entity.BankAccountDTO;

/**
 * @author Morad MELSAOUI
 *
 */
@Repository
public class AccountDAO implements IaccountDAO  {
	
	public static List<BankAccountDTO> listAccount = new ArrayList<BankAccountDTO>(); 
	
	
	public void Init()
	{
		listAccount.add(new BankAccountDTO((long) 1, 2000));
		listAccount.add(new BankAccountDTO((long) 2, 5000));
		listAccount.add(new BankAccountDTO((long) 3, 1000));
	}

	@Override
	public List<BankAccountDTO> getListAccount() {
		// TODO Auto-generated method stub
		return listAccount;
	}
	
	@Override
	public void saveAccount(BankAccountDTO bankAccountDTO){
//		listAccount.get(bankAccountDTO.getId()
		listAccount.add(bankAccountDTO);
	}
	
	 
}
