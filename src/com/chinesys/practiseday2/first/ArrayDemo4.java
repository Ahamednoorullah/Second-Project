package com.chinesys.practiseday2.first;

import java.util.Scanner;

public class ArrayDemo4 {
	int[] arrayVal1 = {10,20,30,40,50};
	int[] arrayVal2 = {20,30,10,40,50};
	
	public void isAscendingArray() {
		if (arrayVal2[1] > arrayVal2[2]) {
			//int temp = arrayVal2[0];
			int temp=arrayVal2[1];
			System.out.println(temp+"   "+arrayVal2[2]);
		}
		else
			System.out.println(arrayVal2[1]);
		
	}
	
	public void sumOfArray() {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		System.out.println("Enter Array Size..");
		int size = sc.nextInt();
		int arrayValue[] = new int[size];
		for (int i = 0; i < arrayValue.length; i++) {
			System.out.println("Enter "+i+" index of Element");
			arrayValue[i] = sc.nextInt();
			sum += arrayValue[i];
			
		}
		
		System.out.println("Sum of Array Element is "+sum);
	}
	
	
	public  void equalOrNot() {
		for (int i = 0; i < arrayVal2.length; i++) {
			if (arrayVal1[i]==arrayVal2[i]) {
				System.out.println("Arrayvalue1 "+i+ " index "+arrayVal1[i]+" is equal to ArrayValue2");
			} else {
                System.out.println("Arrayvalue1 "+i+ " index "+arrayVal1[i]+" is Not equal ArrayValue2");
			}
		}
	}

	public static void main(String[] args) {
		ArrayDemo4 arrDemo = new ArrayDemo4();
		//arrDemo.equalOrNot();
		//arrDemo.sumOfArray();

		arrDemo.isAscendingArray();
		
	}

}
