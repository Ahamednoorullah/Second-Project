package com.chainsys.practiseday5.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cab {

	String vahicle;
	String pickup;
	String drop;
	int pricePer1km[] = { 10, 15, 30, 40 };
	int distance;
	Scanner sc = new Scanner(System.in);
	
	public boolean validation() {
		if ((vahicle != null) && (pickup != null) && (drop != null) ) {
			return true;
		} else {
            return false;
		}
	}

	public void bookingCab() {
		ArrayList<String> vahicleList = new ArrayList<String>();
		String[] cabPlaces = { "Vandalur", "Perungalathur", "Tambaram", "Chrompet", "Pallavaram", "Airport", "Guindy",
				"Saidapet", "Egmore", "Central" };
		vahicleList.add("bike");
		vahicleList.add("auto");
		vahicleList.add("car");
		vahicleList.add("carPremium");
		System.out.println("Cab Vahicle List = " + vahicleList);
		System.out.println("Enter The Vahicle You Travelling in..?");
		vahicle = sc.next();
		if (vahicleList.contains(vahicle)) {
			System.out.println("These Places are Availabe in our CabService \n\t" + Arrays.toString(cabPlaces));
			System.out.println("Enter Your Pickup Location..?");
			pickup = sc.next();
			pickup.equalsIgnoreCase(pickup);
			System.out.println("Enter Your drop Location..?");
			drop = sc.next();
			drop.equalsIgnoreCase(drop);
			int amountDetails = getAmount();
			if (amountDetails > 0) {
				System.out.println("Your Booking Amount is = " + amountDetails + "\n");
				System.out.println("Confirm Your Trip 'Yes' or 'No' ?");
				String confirm = sc.next();
				if (confirm.equalsIgnoreCase("yes")) {
					System.out.println("Your Booking is Confirmed..");
				} else if (confirm.equalsIgnoreCase("no")) {
					System.out.println("Ok,.. Your Booking is Cancelled..");
				} else {
					System.out.println("Your Answer is Incorrect...");
				}
			}

		} else {
			System.out.println("Your Answer is Incorrect in Our Vahicle List...");
		}

	}

	public int getAmount() {
		String[] distancePlace = { "Vandalur", "Perungalathur", "Tambaram", "Chrompet", "Pallavaram", "Airport",
				"Guindy", "Saidapet", "Egmore", "Central" };
		int pk = Arrays.asList(distancePlace).indexOf(pickup);
		int dp = Arrays.asList(distancePlace).indexOf(drop);
		int count = 5;
		for (int i = 0; i < distancePlace.length; i++) {
			if (pk < dp ) {
				count = count + 1;
				pk++;
			} else if(pk > dp){
				count++;
				dp++;
			}
			else if (count == 5) {
				count = 0;
			}
		}
		int amount = 0;
		if (count > 0) {
			switch (vahicle) {
			case ("bike"):
				amount = count * pricePer1km[0];
				System.out.println("Your Travel  " + pickup + " to " + drop + " distance is = " + count + "km");
				break;
			case ("auto"):
				amount = count * pricePer1km[1];
				System.out.println("Your Travel  " + pickup + " to " + drop + " distance is = " + count + "km");
				break;
			case ("car"):
				amount = count * pricePer1km[2];
				System.out.println("Your Travel  " + pickup + " to " + drop + " distance is = " + count + "km");
				break;
			case ("carPremium"):
				amount = count * pricePer1km[3];
				System.out.println("Your Travel  " + pickup + " to " + drop + " distance is = " + count + "km");
				break;

			}

		} else {
			System.out.println("Your Location Answer is Incorrect...");
		}

		return amount;

	}

	public void getDetails() {
      
	}

}
