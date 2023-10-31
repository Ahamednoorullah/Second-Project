package com.chinesys.practiseday2.first;

public class ArrayDemo2 {

	public static void main(String[] args) {
		String[][] multiDimArr = {
				{"mr. ","mrs. ","Hi ","Bye "},
				{"john","adam","smith"}
		};
		//Print mr.john
		System.out.println(multiDimArr[0][0]+multiDimArr[1][0]);
		//print mr.adam
		System.out.println(multiDimArr[0][0]+multiDimArr[1][1]);
        
	}

}
