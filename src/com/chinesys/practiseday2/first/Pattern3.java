package com.chinesys.practiseday2.first;

public class Pattern3 {
	/* A B C D
	 * A B C D
	 * A B C D
	 * A B C D
	 */

	public static void main(String[] args) {
		int numberofRowCal =4;
		int i =0;
		while (i < numberofRowCal) {
			int j =0;char printPattern = 'A';
			while (j < numberofRowCal) {
				System.out.print(printPattern++ +" ");
				j++;
			}
			System.out.println( );
			i++;
			
		}

	}

}
