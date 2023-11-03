package com.chainsys.practiseday6.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuantifiers {

	public static void main(String[] args) {
		String sentence = "abaabbaaabbbabab";
		
		//Pattern p = Pattern.compile("a+");//At least one match
		//Pattern p = Pattern.compile("i*");//any number of match including zero number
		//Pattern p = Pattern.compile("a?");// Atmost one match
		//Pattern p = Pattern.compile("a{3}");//a value {3} 3times vantha print pannu
		Pattern p = Pattern.compile("a{1,3}");// a value {1,3} 1 to 3 vantha print pannanum
		Matcher m = p.matcher(sentence);
		
		while (m.find()) {
			System.out.println(m.group()+" Starts at "+m.start());
		}
		

	}

}
