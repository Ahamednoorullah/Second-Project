package com.chainsys.day11.abstraction;
class Account{
	String accountNo;
	double balance;
	public Account(String accountNo,double balance) {
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		 balance += amount;
	}
	public void withraw(double amount) {
		if (balance >= amount) {
			 balance -= amount;
		} else {
            System.out.println("Insuffient Balance...");
		}
		
	}
	
	public double getBalance() {return balance;}
}

class SavingAccount extends Account{

	public SavingAccount(String accountNo, double balance) {
		super(accountNo, balance);
		
	}
	
	@Override
	public void deposit(double amount) {
		
		super.deposit(amount);
	}
	@Override
	public void withraw(double amount) {
		if (getBalance() - amount < 100) {
			System.out.println("Minimum Balance :100rs");
		} else {
			super.withraw(amount);
		}
		
	}
}
public class Bank {

	public static void main(String[] args) {
		Account savingaccount = new SavingAccount("A2344E33", 5000);
		System.out.println(savingaccount.getBalance());
		savingaccount.deposit(2000);
		System.out.println(savingaccount.getBalance());
		savingaccount.withraw(7000);
		System.out.println(savingaccount.getBalance());
       
	}

}
