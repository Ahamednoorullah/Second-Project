package com.chainsys.day9.encapsul;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SuperMarkettingBilling {

	public static void main(String[] args) {

		String productName = null;
		int quantity = 0;
		double price = 0.0;
		double totalPrice = 0.0;
		double overAllPrice = 0.0;
		double subTotal = 0.0;
		double tax = 0.0;
		double discount = 0.0;
		char choice;

		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		List<Product> product = new ArrayList<>();
		Product p1 = new Product();

		do {
			System.out.println("Enter the Product Details..");
			System.out.println("Enter Product Name..");
			productName = sc.next();
			System.out.println("Enter Quatity..");
			quantity = sc.nextInt();
			System.out.println("Enter Price..");
			price = sc.nextDouble();

			totalPrice = quantity * price;
			overAllPrice += totalPrice;
			product.add(new Product(productName, quantity, price, totalPrice));
			System.out.println("\"Want to add more items? (y or n): \");");
			choice = sc.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		System.out.println("\t\t\t\t\t\t\tDate&Time :" + sdf.format(date));
		Product.displayFormat();
		for (Product p : product) {
			p.display();
		}
		System.out.println("\n\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " + overAllPrice);
		discount = (overAllPrice * 2) / 100;
		System.out.println("\n\t\t\t\t\t\t\t\t\tDiscount (Rs.) " + discount);
		subTotal = overAllPrice - discount;
		System.out.println("\n\t\t\t\t\t\t\t\t\tSubTotal (Rs.) " + subTotal);
		tax = (subTotal * 10) / 100;
		System.out.println("\n\t\t\t\t\t\t\t\t\tTax (%) \t" + tax);
		System.out.println("\t\t\t\t\t\t\t\t\tTotal (Rs.)\t" + (subTotal + tax));

	}

}
