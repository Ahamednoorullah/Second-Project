package com.chinesys.practiseday2.first;

public class BooksArray {

	public static void main(String[] args) {
		String title[] = new String[3];
		String author[] = new String[3];
		
	    title[0] = "The Grapes of Java";
	    title[1] = "The Java Gatsby";
	    title[2] = "The Java Cookbook";
	    author[0] = "bob";
	    author[1] = "sue";
	    author[2] = "ian";
	    
	    for (int i = 0; i < author.length; i++) {
	    	System.out.println(title[i] +" by "+author[i]);
		}
	    }

}
