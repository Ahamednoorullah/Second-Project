package com.chinesys.practiseday2.first;

public class Pattern4 {
	/* * 
	 * * *
	 * *   *
	 * * * * * 
	 */

	public static void main(String[] args) {
		int numOfRowCal = 4; 
		int i =0;
		while (i<numOfRowCal) {
			int j =0;
			while (j < numOfRowCal) {
				if (j == 0 || i == numOfRowCal-1 || i == j)  {
					System.out.print("*");
				} else {
                    System.out.print(" ");
				}
				j++;
			}
			System.out.println( );
			i++;
		}

	}

}
