package com.chinesys.practiseday2.first;

public class Pattern5 {
	/* 1 2 3 4
	 * 1 2 3 4 
	 * 1 2 3 4
	 * 1 2 3 4
	 */

	public static void main(String[] args) {
		int numOfRowCal =4; 
		int i =0 ;
		do {
			int j = 0;int printPattern =1;
			do {
				System.out.print(printPattern++ + " ");
				j++;
			} while (j < numOfRowCal);
			System.out.println();
			i++;
		} while (i < numOfRowCal);

	}

}
