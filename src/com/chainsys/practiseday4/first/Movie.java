package com.chainsys.practiseday4.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Movie{
	String[] name = new String[4];
	String directorName;
	String heroName;
	String heroineName;
	String production;
	int theaterCollection;
	int noOftheatre;
	int day;
	int ticketPrice;
	int seatCount;
	int ticketAvailable;
	Scanner sc = new Scanner(System.in);

	public Movie() {

	}

	// validation
	public boolean validation() {
		System.out.println(seatCount);
		if ((name != null) && (directorName != null) && (day >= 0) && (theaterCollection > 0) && (noOftheatre > 0)
				&& (heroName != null) && (heroineName != null) && (production != null) && (ticketPrice > 0)
				&& (seatCount > 0)) {
			return true;

		} else
			return false;
	}

	public int getBoxOffice(String movieName, int theaterCollection, int noOftheatre) {
		boolean isValid = validation();
		if (isValid == true) {
			int totalCollection = theaterCollection * noOftheatre;
			// System.out.println("Movie Name : " + movieName + "\nTotal Box Office = " +
			// totalCollection);
			return totalCollection;
		} else {
			System.out.println("Invalided code...");
			return 0;
		}

	}

	public void bookTicket(String movieName[], int ticketPrice, int ticketAvailable) {
		ArrayList<String> movieList =new ArrayList<String>();
		movieList.add("Leo");
		movieList.add("Iraivan");
		movieList.add("Maaveeran");
		movieList.add("Tiger");
		
		System.out.println("Movie List =" +movieList);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie Name : ");
		String mName = sc.next();
		try {
			boolean isValid;
			Iterator<String> j = movieList.iterator();
			int i = 0;
			while (j.hasNext()) {
				
				if (mName.contentEquals(movieList.get(i))) {

					System.out.println("This Movie Ticket is Available in " + ticketAvailable + "\nEnter Howmany Seat..?");
					seatCount = sc.nextInt();
					isValid = validation();
					if (isValid == true) {
						if (ticketAvailable >= seatCount) {
							int paid = seatCount * ticketPrice;
							System.out.println("Booking TotalAmount is " + paid + "\nbooking is successfully");
							int rating = reviewRating(mName);
							System.out.println(mName+" Movie Rating is " + rating);
							 break;

						} else {
							System.out.println("Booking is Not Available");
							break;
						}

					} else {
						System.out.println("Invalid code..");
						break;
					}

				
					
				}i++;
			}
			
		} catch (Exception e) {
			System.out.println("This Movie Not Available in Screen..");
		}

	}

	public int reviewRating(String movieName) {
		System.out.println("Enter Rating This Movie 1 to 10..");
		int rating = sc.nextInt();
		return rating;
	}

	public void getRunningDay(int day) {
		boolean isValid = validation();
		if (isValid == true) {
			System.out.println("Movie Running day = " + day);
		} else {
			System.out.println("Invalid Code...");
		}

	}

	public void getDetails(String movieName, String directorName, String heroName, String heroineName,
			String production) {
		boolean isValid = validation();
		if (isValid == true) {
			System.out.println("Movie Name = " + movieName + "\nDirector Name = " + directorName + "\nHero Name = "
					+ heroName + "\nHeroine Name = " + heroineName + "\npProduction = " + production);
		} else {
			System.out.println("Invalid code...");
		}

	}

}
