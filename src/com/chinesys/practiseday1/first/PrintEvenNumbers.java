package com.chinesys.practiseday1.first;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		int num1 = 23;
		int num2 = 57;
		for (int i = num1; i < num2; i++) {
			if (i % 2 == 0 ) {
				System.out.println(i + " is Even Number");
			}
		}
	}

}
