package com.softeam.katabankaccount;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.softeam.katabankaccount.entity.BankAccountDTO;
import com.softeam.katabankaccount.exception.*;
import com.softeam.katabankaccount.service.IaccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceUnitTest {

	@Autowired
    private IaccountService accountService;
	
	    @Test
	    public void testGetAccount() throws BusinessException {
	    	BankAccountDTO bankAccountDTO = accountService.getAccount(2);
	    	assertNotNull(bankAccountDTO);
	    }
	    
		@Test
	    public void testSaveAccount() throws InvalidTransactionException , BusinessException {
	    	accountService.saveAmont(2, 100);
	    	BankAccountDTO bankAccountDTO = accountService.getAccount(2);
	    	assertEquals(100, bankAccountDTO.getAmount(),0);
	    }
	    
		
	    
}
