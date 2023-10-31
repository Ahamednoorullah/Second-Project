package com.chinesys.practiseday2.first;

public class ArrayDemo1 {

	public static void main(String[] args) {
		//Array Declare and intilize
		int[] arrDemo = {1,2,3,4,5,6,7,8};
		//Print Array length
          System.out.println("Array length is "+arrDemo.length);
          //Print Array Element
          for (int i = 0; i < arrDemo.length; i++) {
			System.out.println(i+" index of element ="+arrDemo[i]);
		}
        
	}

}
