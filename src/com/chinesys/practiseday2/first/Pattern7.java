package com.chinesys.practiseday2.first;

public class Pattern7 {
	/* + + + +
	 *   +   +
	 *    +  +
	 *       +
	 */

	public static void main(String[] args) {
		int numOfRowCal = 4;
		int i =0;
		while (i < numOfRowCal) {
			int j =0;
			while (j < numOfRowCal) {
				if (j == numOfRowCal-1 || i == 0 || i == j) {
					System.out.print("+ ");
				
				} else {
                    System.out.print("  ");
				}
				j++;
			}
			j=0;
				while (j < numOfRowCal) {
					if (i+j == numOfRowCal-1 || j == 0 || i == 0) {
						System.out.print("+ ");
					
					} else {
	                    System.out.print("  ");
					}
					j++;
				}
			
			
			System.out.println();
			i++;
			}

	}

}
