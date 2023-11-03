package com.chainsys.practiseday7.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask5 {

	public static void main(String[] args) {
		String name = "Robert Brett Roser";
		String temp = "";
		String[] arr = name.split(" ");
		for (int j = 0; j < arr.length; j++) {
			String dot = ".";
			if(j == arr.length-1) {
				temp += dot+arr[j];
			}else {
				if(j == 0) {
					dot = "";
				}
				temp += dot+arr[j].charAt(0);
			}
		}
		System.out.println(temp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int i = name.lastIndexOf(" ");
//		String surName = name.substring(i+1);
//		System.out.println(surName);
//		
//		Pattern p = Pattern.compile("\\b[a-zA-Z]");
//		Matcher m = p.matcher(name);
//	   String temp = "";
//	   
//		while (m.find()) {
//			
//			//System.out.print(m.group());
//			temp = temp+m.group();
//	
//			
//		}
//		System.out.println(temp);
//		
//		
//		
//		
//		
////		for (int j = 0; j < name.length()-1; j++) {
////			if (name.charAt(j) == ' ') {
////				System.out.print(" "+name.charAt(j) );
////			}
////		}
////		
	}

}
