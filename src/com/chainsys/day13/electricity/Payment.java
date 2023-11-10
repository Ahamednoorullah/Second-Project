package com.chainsys.day13.electricity;

public class Payment extends Bill{
	private String upiId = "abc@icic";
	private long phNumber=7639521787l;


	public Payment(double totalBill) {
		this.totalBill=totalBill;
		paymentOption();
		
	}
	
	public String getUPI() {return upiId;}
	public void setUPI(String upiId) {
		this.upiId=upiId;
	}
	public long getMobileNo() {return phNumber;}
	public void setMobileNo(long phNo) {
		this.phNumber=phNo;
	}
	
	private void paymentOption() {
	
		int choice =0;
		System.out.println("Enter Your Payment Option 1-Gpay 2-Paytm");
		choice = sc.nextInt();
		if (choice==1) {
			paymentBill(upiId);
		} else if(choice == 2) {
            paymentBill(phNumber);
		}
		
	}

	
	public void  paymentBill(String upiId) {
		System.out.println("Enter UPI Id..");
		String upi = sc.next();
	
		if (upi.contains(getUPI())) {
			System.out.println("Your Payment Bill is :"+totalBill);
			System.out.println("Enter Payment..");
			double payment = sc.nextDouble();
			
			if (payment==totalBill) {
				System.out.println("Your Payment through gPay is Successfully");
			} else {
				System.out.println("Your Payment through gPay has been  declined..");
			}
		} else {
           System.out.println("Your UPI ID Not Match");
		}
		
	
	}

	public void paymentBill(long phNunmber) {
		System.out.println("Enter PayTm Mobile Number..");
		long mobileNo=sc.nextLong();
		if (mobileNo==getMobileNo()) {
			System.out.println("Your Payment Bill is :"+totalBill);
			System.out.println("Enter Payment..");
			double payment = sc.nextDouble();
			
			if (payment==totalBill) {
				System.out.println("Your Payment through PayTm is Successfully");
			} else {
				System.out.println("Your Payment through PayTm has been  declined..");

			}

		} else {
			System.out.println("Your PayTM Mobile Number Not Match");

		}
			}
}
