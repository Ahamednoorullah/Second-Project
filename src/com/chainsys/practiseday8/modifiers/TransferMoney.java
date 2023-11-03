package com.chainsys.practiseday8.modifiers;
class PaymentBills{
	void payment() {
		System.out.println("Send Money home,Recharge Mobile,Shop online");
	}

}
class Gpay extends PaymentBills{
	void payment(){
		System.out.println("Do direct Bank to bank Transfer..");
	}
}
class Paytm extends PaymentBills{
	void payment(){
		System.out.println("You can transfer money through QR code.");
	}
}
class Bank extends PaymentBills{
	void payment(){
		System.out.println("You can transfer money through Bank Account Number and Ifsc code..");
	}
}

public class TransferMoney {

	public static void main(String[] args) {
		PaymentBills gpay = new Gpay();
		PaymentBills paytm = new Paytm();
		gpay.payment();
		paytm.payment();
	}

}
