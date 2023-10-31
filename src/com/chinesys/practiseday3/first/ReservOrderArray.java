package com.chinesys.practiseday3.first;

import java.util.Arrays;
import java.util.Scanner;

public class ReservOrderArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   int[] arrElement1 = new int[10];
	   int[] reversElement = new int[10];

	   int i;
	   for (i = 0; i < arrElement1.length; i++) {
		System.out.println("Enter "+i+" index of Element..");
		arrElement1[i] = sc.nextInt();
		
	}
	   i=0;int temp;
	   for (int j = arrElement1.length-1; i < arrElement1.length; j--,i++) {
		temp=arrElement1[i];
		reversElement[i] = arrElement1[j];
		reversElement[j] = temp;
	}
	   System.out.println("Before Reverse Element In Array..........");
	 System.out.println(Arrays.toString(arrElement1));
	 System.out.println("After Reverse Element In Array..........");
	 System.out.println(Arrays.toString(reversElement));
	}

}
