package com.chinesys.practiseday3.first;
class Calc{
	public void add(int num1,int num2) {
		int result = num1 + num2 ;
		System.out.println(num1+" + "+num2+" = "+result);
	}
	
	public void sub(int num1,int num2) {
		int result = num1 - num2;
		System.out.println(num1+" - "+num2+" = "+result);
	}
}

public class Calculator {

	public static void main(String[] args) {
		Calc casio = new Calc();
		casio.add(2,3);
		casio.sub(10,4);

	}

}
