package com.chainsys.practiseday6.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearningDemo3 {
	//Character Class in regex

	public static void main(String[] args) {
		String sentence = "ababcbcaabba25237@$##%";
		
		//Pattern p = Pattern.compile("[ab]");//Either a or b or c compile pannum
		//Pattern p = Pattern.compile("[^ab]");// Except a and b 
		Pattern p = Pattern.compile("[a-zA-Z]");//All alphabets  
		//Pattern p = Pattern.compile("[0-9]");//Number only 
		//Pattern p = Pattern.compile("[^a-zA-Z0-9]");//Except Alphanumaric print spl character
		Matcher m = p.matcher(sentence);
		
		while (m.find()) {
			System.out.println(m.group()+" starts at "+m.start());
		}
	}

}
