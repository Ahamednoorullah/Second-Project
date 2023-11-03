package com.chainsys.practiseday6.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPredefinedClasses {
	//Predined Classes in Regex

	public static void main(String[] args) {
		String sentences = "TamilTamilan &TamilNadu 600045";
		
		
		//Pattern p = Pattern.compile("\\s");//only space print
		//Pattern p = Pattern.compile("\\S");//Non space print
		//Pattern p = Pattern.compile("\\d");//Only digit venum 
		//Pattern p = Pattern.compile("\\D");// Non digit character including space print
		//Pattern p = Pattern.compile("\\w");// Except spl charcter and print all alphanumeric
		//Pattern p = Pattern.compile("\\W");//Except alphanumeric and print spl character include space
		//Pattern p = Pattern.compile("\\bTamil");//Tamil nu word oru boundry mundinji start aagutha
		//Pattern p = Pattern.compile("\\BTamil");// Tamil word boundry mudiyama Tamil varutha
		//Pattern p = Pattern.compile("\\GTamil");//Tamil word mudinji thirumba Tamil varutha
		Pattern p = Pattern.compile(".");//All character venum na 
		Matcher m = p.matcher(sentences);
		
		while (m.find()) {
			System.out.println(m.group()+" Starts at "+m.start());
		}

	}

}
