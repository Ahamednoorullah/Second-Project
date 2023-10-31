package com.chinesys.practiseday3.first;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+i+" index of Element..");
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length;i++) {
			if (arr[i] > 0) {
				System.out.println(arr[i]+" is Positive Number in Array Element");
			}
		}
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				System.out.println(arr[i]+ " is Negative Number in Array Element");
			}
		}
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] +" is Even Number in Array Element");
			}
			else {
				System.out.println(arr[i]+ " is Odd Number in Array Element");
			}
		}
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println(arr[i] +" in Array Element");
			} 
		}
		
		
		
			
		

	}

}
