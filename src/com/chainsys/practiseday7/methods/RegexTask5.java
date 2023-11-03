package com.chainsys.practiseday7.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask5 {

	public static void main(String[] args) {
		String name = "Robert Brett Roser Albert";
		String temp = "";
		String[] arr = name.split(" ");
		for (int j = 0; j < arr.length; j++) {
			String dot = ".";
			if (j == arr.length - 1) {
				temp += dot + arr[j];
			} else {
				if (j == 0) {
					dot = "";
				}
				temp += dot + arr[j].charAt(0);
			}
		}
		System.out.println(temp);
	}

}
