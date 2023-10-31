package com.chinesys.practiseday2.first;

public class Patterns1 {
	/* 1 1 1 1 
	 * 1 1 1 1
	 * 1 1 1 1
	 * 1 1 1 1
	 */

	public static void main(String[] args) {
		int numberOfRowCol = 4;int printPattern = 1;
		int i=0;
		while (i < numberOfRowCol) {
			int j =0;
			while (j < numberOfRowCol) {
				System.out.print(printPattern +" ");
				j++;
			}
			i++;
			System.out.println( );
			
		}

	}

}
