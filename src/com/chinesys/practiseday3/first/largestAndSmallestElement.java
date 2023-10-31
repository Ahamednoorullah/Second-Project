package com.chinesys.practiseday3.first;

import java.util.Arrays;

public class largestAndSmallestElement {

	public static void main(String[] args) {
		int[] arr = {12,3,44,36,87,66};
        int max =0;int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
			
		}
        System.out.println(Arrays.toString(arr));
        System.out.println("Largest Element in Array = "+max);
        System.out.println("Smallest Element in Array = "+min);
	}

}
