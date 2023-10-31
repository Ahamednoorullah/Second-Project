package com.chainsys.practiseday4.first;

import java.util.Arrays;
import java.util.Scanner;

public class TestMovie {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.name[0] ="Leo";
		m1.name[1] ="Iraivan";
		m1.name[2] ="Maaveeran";
		m1.name[3] ="Tiger";
		m1.directorName = "Loki";
		m1.heroName = "vijay";
		m1.heroineName = "trisha";
		m1.production = "7screen";
		m1.theaterCollection = 2000;
		m1.noOftheatre = 9;
		m1.day = 20;
		m1.ticketPrice=120;

		m1.ticketAvailable=10;
		m1.bookTicket(m1.name,m1.ticketPrice,m1.ticketAvailable);
		//int collection = m1.getBoxOffice(m1.name, m1.theaterCollection, m1.noOftheatre);
		//System.out.println(collection);
		//m1.getDetails(m1.name, m1.directorName, m1.heroName, m1.heroineName,m1.production);
		 
		//m1.getRunningDay(m1.day);

	}

}
