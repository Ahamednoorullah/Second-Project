package com.chainsys.practiseday7.methods;

import java.util.regex.Pattern;

public class RegexSplitMethod {

	public static void main(String[] args) {
		/*String split method argument aa regex pattern vaangum
		 * Pattern class split method argument String vaangum namma already pattern la 
		 * regex pattern compile pannittom
		 */
		
		String name = "Ahamed Noorullah";
		String website ="www.google.com";
		String[] st = name.split("\\b");//space vachi print pannum
		String[] st2 = website.split("\\.");// 
		
		for (String s : st) {
			System.out.println(s);
		}
		
		//Pattern p = Pattern.compile("\\s");
//		Pattern p = Pattern.compile("\\.");
//		String[] str = p.split(website);
//		
//		for (String s : str) System.out.println(s);
//			
		
	}

}
