package com.chainsys.practiseday7.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckLetterInPresent {
	//WAJPT check if the letter 'e' is present in the word 'umbrella'

	public static void main(String[] args) {
		String word = "Umbrella";
		
		Pattern p = Pattern.compile("e");
		Matcher m = p.matcher(word);
		
		if (m.find()) {
			System.out.println(p+" present in the word "+word);
		} else {
			System.out.println(p+" Not present in the word "+word);
		}
		

	}

}
