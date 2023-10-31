package com.chainsys.practiseday5.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Cab {

	String vahicle;
	String pickup;
	String drop;
	int pricePer1km = 30;
	int distance;
	Scanner sc = new Scanner(System.in);
	
	public void bookingCab() {
		System.out.println("Enter The Vahicle You Travelling in");
		vahicle = sc.next();
		System.out.println("Enter Your Pickup Location..");
		pickup = sc.next();
		System.out.println("Enter Your drop Location");
		drop = sc.next();
		System.out.println(vahicle+","+ pickup+","+drop);
		int amountDetails = getAmount();
		System.out.println("Your Booking Amount is = "+amountDetails+"\n");
		System.out.println("Confirm Your Trip 'Yes' or 'No' ?");
		String confirm = sc.next();
		if (confirm.contentEquals("Yes")  || confirm.contentEquals("YES") || confirm.contentEquals("yes") ) {
			System.out.println("Your Booking is Confirmed..");
		} else if(confirm.contentEquals("NO") || confirm.contentEquals("no") || confirm.contentEquals("No")){
            System.out.println("Ok,.. Your Booking is Cancelled..");
		}else {
			System.out.println("Invalid Answer...");
		}
	}
	
	public int getAmount(){
		String[] distancePlace = {"Vandalur","Perungalathur","Tambaram","chrompet"};
		int pk = Arrays.binarySearch(distancePlace, pickup);
		int dp = Arrays.binarySearch(distancePlace, drop);
		int count = 20;
		for (int i = 0; i < distancePlace.length; i++) {
			if (pk <= dp)  {
				count++;
			}
		}
		int amount = count*pricePer1km;
		return amount;
	}
	public void getDetails() {
		
	}
	
}
