/* File: BankAccountTest.java
 * ---------------------------
 * Dependencies:
 *    /src/Lec04/BankAccount.java
 * ---------------------------
 */
package Lec04;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Lec04_UnitTest.BankAccount;

public class BankAccountTest {

    BankAccount account;
    
    @Before
    public void setUp() {
        account = new BankAccount();
    }

	@Test
	public void testNegativeDepositThrowException() {
		//BankAccount account = new BankAccount();
		assertEquals(0, account.getBalance());
		try {
			account.deposit(-1);
			// test if exception will be thrown.
			fail(); 
		} catch (IllegalArgumentException ioe) {
			// Expected!
		}
		assertEquals(0, account.getBalance());
	}

    // 2nd way to test exception
	@Test(expected=IllegalArgumentException.class)
    public void testNegativeDepositThrowExceptions() {
       account.deposit(-1); 
    }
	
	@After
	public void endUp() {
		
	}
}
