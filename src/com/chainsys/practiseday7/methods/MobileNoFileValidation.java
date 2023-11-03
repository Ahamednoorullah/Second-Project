package com.chainsys.practiseday7.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoFileValidation {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("‪D:\\mobile\\test.txt");
		Scanner sc = new Scanner(file);
		
		boolean linePresent = sc.hasNext();
		while (linePresent) {
			String word = sc.next();
			int i = word.lastIndexOf(":");
			String mobile = word.substring(i+1);
			System.out.println(mobile);
			
			Pattern p = Pattern.compile("(0|+91)?[6-9][0-9]{9}");
			Matcher m = p.matcher(mobile);
			
			if (m.find()) {
				System.out.println(m.group()+" is Valid Mobile No");
			} else {
	            System.out.println(mobile+"is Not Valid Mobile No");
			}
			linePresent = sc.hasNext();
		}
		
		

	}

}
