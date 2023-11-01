package com.chainsys.practiseday6.methods;

public class PractiseStringClassMethod {
	
	public void compareStringMethod() {
		String s1 = new String("Java");
		String s2 = new String("java");
		
	//	boolean result = s1.equals(s2);
	//	boolean result = s1.equalsIgnoreCase(s2);
		
		//lexicography
		// dictionary padi equal iruntha Zero return pannum
		//greater iruntha +ve value & lessthan iruntha -ve value
		int result = s1.compareTo(s2);
		System.out.println(result);
		
		boolean res = s1.startsWith("J");       //starts with prefix
		boolean res1 = s1.startsWith("va", 2);   //starts with prefix and index value koduthu check 
		boolean res2 = s1.endsWith("a");         //ends with
		boolean res3 = s1.contentEquals(s2);    //contents equal 
		System.out.println(res3);
		
	}
	
	public void prStringMethod1() {
		String str = new String("Ahamed");
		String str1 = " ";
		
		System.out.println(str.length());
		System.out.println(str1.isBlank());
		System.out.println(str1.isEmpty());
		
	}
	public void prStringMethod() {
		String str1 = "dbcgdfdhefheihfiehife";
		String str2 = "Java  ";
		String str3 = "Java";
//		System.out.println(str1.compareToIgnoreCase(str2));
//		System.out.println(str1.equalsIgnoreCase(str2));
//		System.out.println(str1.charAt(0));
//		System.out.println(str1.codePointAt(1));
//		System.out.println(str1.codePointBefore(1);
//		System.out.println(str1.codePointCount(0,6));
//	    System.out.println(str1.offsetByCodePoints(1,10));
	    System.out.println(str2.equals(str3));
//		System.out.println(str3.compareTo(str2));
//		System.out.println(str2.compareToIgnoreCase(str3));
//		System.out.println(str2.contentEquals(str3));
//		System.out.println(str2.equalsIgnoreCase(str3));
//		System.out.println(str2.startsWith("a"));//
//	    System.out.println(str2.indexOf('a'));
//	    System.out.println(str2.indexOf('d', 1));
//	    System.out.println(str2.isEmpty());
//		str2.toUpperCase();//print pannum pothu uppercase la varum..
//		System.out.println(str2);
//		System.out.println(str2.trim());
	    
	}
	
	
	public void subString() { //String substring method
		System.out.println("abc");
	     String cde = "cde";
	     System.out.println("abc" + cde);
	     String c = cde.substring(0,2);
	     String d = cde.substring(1);

	     System.out.println(c);
	     System.out.println(d);
	
	}


	public static void main(String[] args) {
		PractiseStringClassMethod pr = new PractiseStringClassMethod();
		pr.compareStringMethod();
		//pr.subString();
		//pr.prStringMethod();

	}

}
