package com.chainsys.practiseday5.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cab {

	String vehicle;
	String pickup;
	String drop;
	int distance;
	Scanner sc = new Scanner(System.in);
	
	public boolean validation() {
		if ((vehicle != null) && (pickup != null) && (drop != null) ) {
			return true;
		} else {
            return false;
		}
	}

	public void bookingCab() {
		ArrayList<String> vahicleList = new ArrayList<String>();
		ArrayList<String> cabPlaces = new ArrayList<String>();
				Collections.addAll(cabPlaces, "Vandalur", "Perungalathur", "Tambaram", "Chrompet", "Pallavaram", "Airport", "Guindy","Saidapet", "Egmore", "Central" );
		vahicleList.add("Bike");
		vahicleList.add("Auto");
		vahicleList.add("Car");
		vahicleList.add("CarPremium");
		System.out.println("Cab Vahicle List = " + vahicleList);
		System.out.println("Enter The Vahicle You Travelling in..?");
		vehicle = sc.next();
		if (vahicleList.contains(vehicle)) {
			System.out.println("These Places are Availabe in our CabService \n\t" + cabPlaces);
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
					System.out.println("Sorry..I only asked you 'Yes' or 'No'.");
				}
			}

		} else {
			System.out.println("Sorry...We only have the above vehicle list Available...");
		}

	}

	public int getAmount() {
		
		ArrayList<String> distancePlace = new ArrayList<>();
		Collections.addAll(distancePlace,"Vandalur", "Perungalathur", "Tambaram", "Chrompet", "Pallavaram", "Airport","Guindy", "Saidapet", "Egmore", "Central");
		
		int pickupIndex = distancePlace.indexOf(pickup);
		int dropIndex = distancePlace.indexOf(drop);
		int km = 5;
		for (int i = 0; i < distancePlace.size(); i++) {
			if (pickupIndex < dropIndex ) {
				km = km + 1;
				pickupIndex++;
			} else if(pickupIndex > dropIndex){
				km++;
				dropIndex++;
			}
			else if (km == 5) {
				km = 0;
			}
		}
		int amount = 0;
		if (km > 0) {
			switch (vehicle) {
			case ("Bike"):
				amount = km * 10;
				System.out.println("Your Travel  " + pickup + " to " + drop + " distance is = " + km + "km");
				break;
			case ("Auto"):
				amount = km * 15;
				System.out.println("Your Travel  " + pickup + " to " + drop + " distance is = " + km + "km");
				break;
			case ("Car"):
				amount = km * 30;
				System.out.println("Your Travel  " + pickup + " to " + drop + " distance is = " + km + "km");
				break;
			case ("CarPremium"):
				amount = km * 40;
				System.out.println("Your Travel  " + pickup + " to " + drop + " distance is = " + km + "km");
				break;

			}

		} else {
			System.out.println("Sorry..We only have the above Location Available Now...");
		}

		return amount;

	}

	public void getDetails() {
      
	}

}
