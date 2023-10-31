package com.chinesys.practiseday2.first;

public class smallestElement {

	public static void main(String[] args) {
		int arr[] = {12,33,44,56,77,99};
		int min = arr[0];
             for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
             System.out.println("Smallest Element in Array : "+min);
	}

}
