package com.chainsys.practiseday7.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindTheOccurrence {
	//WAJPT Find the first and the last occurrence of the letter 'o' and ','in "Hello,World".

	public static void main(String[] args) {
		String sentence = "Hello,World";
		
		Pattern p = Pattern.compile("o|,");
		Matcher m = p.matcher(sentence);
		
		while (m.find()) {
			System.out.println(m.group()+" Starts at "+m.start()+" and end at "+m.end());
		}

	}

}
