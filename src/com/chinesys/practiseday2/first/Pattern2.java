package com.chinesys.practiseday2.first;

public class Pattern2 {
	/*1 2 3 4 
	 *5 6 7 8
	 *9 10 11 12
	 *13 14 15 16 
	 */

	public static void main(String[] args) {
		int numberofRowcal =4; int printPattern = 1;
		int i = 0;
		while (i < numberofRowcal) {
			int j = 0;
			while (j < numberofRowcal) {
				System.out.print(printPattern+" ");
				j++;
				printPattern++;
			}
			System.out.println( );
			i++;
		}

	}

}
