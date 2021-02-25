package com.softeam.katabankaccount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.softeam.katabankaccount.constants.Constants;
import com.softeam.katabankaccount.entity.BankAccountDTO;
import com.softeam.katabankaccount.exception.BusinessException;
import com.softeam.katabankaccount.exception.InvalidTransactionException;
import com.softeam.katabankaccount.service.IaccountService;
import com.softeam.katabankaccount.service.IaccountTransactionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountTransactionServiceUnitTest {
	
	@Autowired
	private IaccountTransactionService iaccountTransactionService;
	
	@Autowired
    private IaccountService accountService;
	
	 @Test
	  public void testGetSumTransactionByAccoutByDateByType() throws BusinessException, InvalidTransactionException {
		 LocalDate currentdate = LocalDateTime.now().toLocalDate();
		 
		BankAccountDTO bankAccountDTO = accountService.getAccount(2);
		double newBalance = bankAccountDTO.getAmount() - 10;
		bankAccountDTO.setAmount(newBalance);
		accountService.saveAmont(1, newBalance);
	    double sumtransaction = iaccountTransactionService.getSumTransactionByAccoutByDateByType(1, currentdate, Constants.TRANSACTION_RETRAIT_TYPE);
	    
	    assertEquals(1, sumtransaction,0);
	  }
	    

}
