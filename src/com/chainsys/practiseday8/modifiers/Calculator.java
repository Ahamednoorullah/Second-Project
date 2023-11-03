package com.chainsys.practiseday8.modifiers;

// Method overloading
class Calc{
	void add(int[] arr) {
		int res =0;
		for (int i : arr) {
			res += i;
		}
		System.out.println(res);
	}
	void add(double num1,double num2) {
		double res =  num1 + num2;
		System.out.println(res);
	}
	void add(int num1,int num2) {
		int res =  num1 + num2;
		System.out.println(res);
	}
}

public class Calculator {

	public static void main(String[] args) {
		Calc casio = new Calc();
		int[] arr = {2,4,5,6,7,8};
		casio.add(arr);
		casio.add(2.3, 4.5);
		

	}

}
