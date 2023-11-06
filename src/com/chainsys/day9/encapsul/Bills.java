package com.chainsys.day9.encapsul;

import java.util.ArrayList;
import java.util.Scanner;

public class Bills {
	private String productName;
	private int quantity;
	private double price;
	public Bills() {
		
	}
	public Bills(String productName,int quantity,double price) {
		this.productName=productName;
		this.quantity=quantity;
		this.price=price;
	}
	public String getProductName() {return productName;}
	public int getQuantity() {return quantity;}
	public double getPrice() {return price;}
	
	double total =0;
	double subtotal;
	double discount =0;
	double finaltotal =0;
	public void totalBill() {
		ArrayList items = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		   System.out.println("Welcome to the Supermarket Billing System");
	       System.out.println("Enter the item details:");
	       
	       while (true) {
	    	   double itemTotal = 0;
			System.out.println("Enter Item Name");
			String itemName = sc.next();
			if (itemName.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.println("Enter Quantity");
			int itemQuantity = sc.nextInt();
			System.out.println("Enter price");
			double itemPrice = sc.nextDouble();
			Bills bills = new Bills(itemName, itemQuantity, itemPrice);
			items.add(bills);
			itemTotal =itemQuantity*itemPrice;
			subtotal +=itemTotal;
			System.out.println(itemName+"\t$"+itemPrice+"\tQty :"+itemQuantity+"\tItemTotal :"+itemTotal);
		}
	       Bills bills = new Discount(subtotal,finaltotal);
             bills.totalBill();
	     
	}
}
class Discount extends Bills
{
	public Discount(double subtotal,double finaltotal) {
		this.subtotal=subtotal;
		this.finaltotal=finaltotal;
	}
	public void totalBill() {
		if (subtotal > 100) {
			discount = (subtotal/100)*10;
			
		}
		 finaltotal = subtotal - discount;
	        System.out.println("Subtotal: $" + subtotal);
	        System.out.println("Discount: $" + discount);
	        System.out.println("Total: $" + finaltotal);
	}
}


