package com.chainsys.practiseday6.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearningDemo2 {
	/*1, Startind words in a given sentences
	 * 2,Ending words in a given sentences
	 * 3,Any two character in a given sentences
	 */

	public static void main(String[] args) {
		String sentences = "Tamil is the oldest Language";
		
	
		//Pattern p = Pattern.compile("^Tamil");
		Pattern p = Pattern.compile("Language$");
		//Pattern p = Pattern.compile("t|s");
		Matcher m = p.matcher(sentences);
		
		while (m.find()) {
			System.out.println(m.group()+" Starts at"+m.start()+" and ends at"+m.end());
		}

	}

}
