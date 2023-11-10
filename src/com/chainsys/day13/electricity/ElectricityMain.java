package com.chainsys.day13.electricity;

public class ElectricityMain {

	public static void main(String[] args) {
		
		Bill bill = new Bill();
		bill.ElectricityApp();
		boolean isValid=bill.validation();
		if (isValid==true) {
			bill.displayBill();
		} 
	}

}
