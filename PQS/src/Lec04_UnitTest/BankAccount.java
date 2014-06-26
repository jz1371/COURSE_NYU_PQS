/* File :
 */
package Lec04_UnitTest;

public class BankAccount {
	
	public BankAccount() {
	}
	
	public BankAccount(String clientName,int accountBalance) {
		userName = clientName;
		balance = accountBalance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public String getName()	{
		return userName;
	}
	
	public void deposit(int deposit) {
		if (deposit < 0) {
			throw new IllegalArgumentException("Negative deposit");
		}
		balance += deposit;
	}
	
	private String userName;
	private int balance;
}
