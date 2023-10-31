package com.chinesys.practiseday3.first;

import java.util.Arrays;

public class SumProdOfArray {
	//Find sum and Prod Of all Elament in Array

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,20,15};
		int sum =0;int prod = 1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			prod *= arr[i];
		}
		System.out.println(Arrays.toString(arr));
         System.out.println("Sum of All Element in Array = "+sum);
         System.out.println("Product of All Element in Array = "+prod);
	}

}
