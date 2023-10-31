package com.chinesys.practiseday2.first;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrDemo = new int[5];int i;
		for ( i = 0; i < arrDemo.length; i++) {
			System.out.println("Enter "+i+" index of Element");
			arrDemo[i] = sc.nextInt();
			
		}
		for (int x : arrDemo) {
			System.out.println(x);
		}

	}

}
