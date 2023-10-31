package com.chinesys.practiseday1.first;

import java.util.Scanner;

public class ShopDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Howmany Quantity do you want");
		int quantity = sc.nextInt();
		if (quantity > 0) {
		int price = 100;
		
		int totalPrice = quantity*100;
		
		if (totalPrice > 1000) {
		  int discount =totalPrice/10;
		  totalPrice -= discount;
		}
		System.out.println("User TotalCost is "+ totalPrice);
		}else {
			System.out.println("Invalid Quantity items");
		}
		
	}

}
