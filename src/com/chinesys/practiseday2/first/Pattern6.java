package com.chinesys.practiseday2.first;

public class Pattern6 {
	/* A B C D
	 * E F G H 
	 * I J K L 
	 * M N O P
	 */

	public static void main(String[] args) {
		int numOfRowCal = 4;char printPattern = 'A';
		int i = 0;
		do {
			int j= 0;
			do {
				System.out.print(printPattern++ +" ");
				j++;
			} while (j < numOfRowCal);
			System.out.println();
			i++;
		} while (i < numOfRowCal);

	}

}
