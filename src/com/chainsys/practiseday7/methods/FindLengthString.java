package com.chainsys.practiseday7.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindLengthString {
	//WAJPT Find the Length of the String "refrigerator"

	public static void main(String[] args) {
		String sentence = "refrigerator";
		
		Pattern p = Pattern.compile("[a-zA-Z]");
		Matcher m = p.matcher(sentence);
		int count= 0;
		while (m.find()) {
		count++;
	
		}
		System.out.println("Sentence length is "+count);

	}

}
