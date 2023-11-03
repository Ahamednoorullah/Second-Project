package com.chainsys.practiseday7.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoValidation {

	public static void main(String[] args) {
		String mobile = "+919876548327";
		
		Pattern p = Pattern.compile("(0|+91)?[6-9][0-9]{9}");
		Matcher m = p.matcher(mobile);
		
		if (m.find()) {
			System.out.println(m.group()+" is Valid Mobile No");
		} else {
            System.out.println(mobile+"is Not Valid Mobile No");
		}
	}

}
