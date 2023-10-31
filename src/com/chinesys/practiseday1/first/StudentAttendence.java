package com.chinesys.practiseday1.first;

import java.util.Scanner;

public class StudentAttendence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Classes...");
		int totalClasses = sc.nextInt();
		System.out.println("Enter Student Attended Classes");
		int stdAttendClass = sc.nextInt();
		if (stdAttendClass > 0) {

			int percentage = stdAttendClass / totalClasses * 100;

			if (percentage > 75) {
				System.out.println("Student Allowed in Exam Hall..");
			} else {
				System.out.println("Student Not allowed in Exam Hall \n So,Are there Madical resons('Y' or 'N'");
				char userAnswer = sc.next().charAt(0);
				/*if (userAnswer == 'Y' || userAnswer == 'y' || userAnswer == 'N' || userAnswer == 'n') {
		
				if (userAnswer == 'Y' || userAnswer == 'y') {
					System.out.println("Student Allowed  in Exam Hall");
				} else {
					System.out.println("Student Not Allowed in Exam Hall");
				}
				}else {
					System.out.println("Student Inavalid Answer..");
				}
	
			} */
				switch (userAnswer) {
				case 'Y' :
				case 'y' :
					System.out.println("Student Allowed in Exam Hall");
					break;
				case 'N':
				case 'n':
					System.out.println("Student Not Allowed In Exam Hall");
                    break;
				default:
					System.out.println("Student Inavalid Answer...");
					break;
				}
			}
		} else {
			System.out.println("Student Attended Invalided ....");
		}

	}

}
