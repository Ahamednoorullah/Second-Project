package com.chinesys.practiseday2.first;

import java.util.Arrays;

public class largestElement {

	public static void main(String[] args) {
		int arr[] = {10,44,66,43,23,98};
		System.out.println(Arrays.toString(arr));
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest elements in Array ="+max);


	}

}
