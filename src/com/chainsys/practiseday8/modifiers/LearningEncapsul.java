package com.chainsys.practiseday8.modifiers;
class Account {
	private long accountNo;
	private String email;
	private double amount;
	private String name;
	
	public long getAccountNo() {return accountNo;}
	public void setAccountNO(long accountNo) {
		this.accountNo=accountNo;
	}
	
	public String getEmail() {return email;}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public double getAmount() {return amount;}
	public void setAmount(double amount) {
		this.amount=amount;
	}
	
	public String getName() {return name;}
	public void setName(String name) {
		this.name=name;
	}
}

public class LearningEncapsul {

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccountNO(242534251);
		account.setName("john");
		account.setEmail("abc@gmail.com");
		account.setAmount(10000);
		
		System.out.println("A person name is "+account.getName()+"\nAccount No "+account.getAccountNo()+"\nEmail is "+account.getEmail()+"\nAmount = "+account.getAmount());
		

	}

}
