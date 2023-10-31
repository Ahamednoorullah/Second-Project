package com.chinesys.practiseday1.first;

import java.util.Scanner;
import java.io.*;
import java.lang.*;
	
public class PrintColorName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Color Code..");
		char ch = sc.next().charAt(0);
		ch = Character.toUpperCase(ch);
		// boolean digit = Character.isDigit(ch);
		boolean alphabetic = Character.isAlphabetic(ch);
      
		System.out.println(alphabetic);
		if (alphabetic == true) {
			switch (ch) {
			case 'R':
				System.out.println("Red");
				break;
			case 'G':
				System.out.println("Green");
				break;
			case 'B':
				System.out.println("Blue");
				break;
			case 'W':
				System.out.println("White");
				break;
			case 'Y':
				System.out.println("Yellow");
				break;
			case 'O':
				System.out.println("Orange");
				break;

			default:
				System.out.println("Invalid Code...");
				break;
			}
		} else
			System.out.println("invalid input");

	}

}
