package com.chinesys.practiseday2.first;

import java.util.Scanner;

public class StdsPercentageArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Howmany Student in class");
		int students = sc.nextInt();
		int[] stdAttendClass = new int[students];

		
		System.out.println("Enter Total Classes...");
		int totalClasses = sc.nextInt();
		for (int i = 0,j=1; i < stdAttendClass.length; i++,j++) {
			System.out.println("Enter "+j+" Student Attended Classes");
			 stdAttendClass[i] = sc.nextInt();
			 System.out.println(stdAttendClass[i]);
		}
		
		int percentage[] = new int[students];
		for (int i = 0; i < percentage.length; i++) {
			percentage[i] = stdAttendClass[i] / totalClasses * 100;
			System.out.println(percentage[i]);
		}
		
		for (int i = 0,j=1; i < percentage.length; i++,j++) {
			if (percentage[i] > 75) {
				System.out.println("Student "+j+" Allowed in Exam Hall");
			} else {
                System.out.println("Student "+j+ " Not Allowed in Exam Hall");
			}
		}

	}

}
