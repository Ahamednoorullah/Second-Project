package com.chinesys.practiseday3.first;

import java.util.Arrays;

public class ArrayPractise1 {
	/* WAJPT check weather Specific element 
	 is Present in this Array or Not?
	*/
	public static void checkPresentInArray(int arr[],int toCheckValue) {
	         boolean test = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == toCheckValue) {
				test = true;
				break;
				
			}
		}
		System.out.println(toCheckValue+" is present in This Array "+test);
	}

	public static void main(String[] args) {
		int arr[] = {5, 1, 1, 9, 7, 2, 6, 10};
		int toCheckValue = 21;
		System.out.println(Arrays.toString(arr));
		checkPresentInArray(arr,toCheckValue);
		}

}
