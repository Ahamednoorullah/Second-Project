package com.chinesys.practiseday1.first;

import java.util.Scanner;

public class CompareTwoNumbers 
//CapitalCamelCase
//relevant class name
//int is a keyword
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Integrer");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Integrer");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " is Greater than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is Less than " + num2);
		} else {
			System.out.println(num1 + " is Equal to " + num2);
		}
	}

}
