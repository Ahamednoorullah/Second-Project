package com.chainsys.day13.electricity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bill implements Electricity{
 
	private long serviceConnectionNumber;
	private long mobileNumber;
	private int unit;
	double totalBill;
	Scanner sc = new Scanner(System.in);
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	public Bill() {
	}
	
	public void ElectricityApp() {
		System.out.println("Enter Your UserName..");
		String user = sc.next();
		System.out.println("Enter Password..");
		String pass = sc.next();
		if (user.contains(userName) && pass.contains(password)) {
			
			calculateBill();
		} else {
            System.out.println("UserName Not Found or Incorrect Password");
		}
		
	}

	public long getSCNumber() {return serviceConnectionNumber;}
	public long getPHnumber() {return mobileNumber;}
	public double getUnit() {return unit;}
		
	public void setUnit(int unit) {
		this.unit=unit;
	}

	
	@Override
	public boolean validation() {
		Pattern p =Pattern.compile("(0|91)?[6-9][0-9]{9}");
		String phn=Long.toString(mobileNumber);
		Matcher mobile =p.matcher(phn);
		String service = Long.toString(serviceConnectionNumber);
		if (mobile.find() && service.length()==12 && unit >= 0) {
			return true;
		} else {
             return false;
		}
	}
	@Override
	public double calculateBill() {
		System.out.println("Enter Service Connection Number(12 digit).");
		this.serviceConnectionNumber=sc.nextLong();
		System.out.println("Enter Mobile Number");
		this.mobileNumber=sc.nextLong();
	
		
		boolean isValid = validation();
		if (isValid==true) {
			System.out.println("Enter units...");
			setUnit(sc.nextInt());
			if (unit < 100) {
				totalBill=unit*1.20;
			} else if(unit < 500){
				totalBill=100*1.20+(unit-100)*2;

			}else if(unit >= 500) {
				totalBill=100*1.20+200*2+(unit-300)*3;
			}
		
		}else {
			System.out.println("Invalid Number...");
		}
		
		
		return totalBill;
	}

	@Override
	public void displayBill() {
		System.out.println(".........................................................");
		System.out.println("Date\t\tServiceNumber\t\tUnits\t\tTotalBill");
		System.out.println("...........................................................");
		System.out.println(sdf.format(date)+"\t"+serviceConnectionNumber+"\t\t"+unit+"\t\t"+totalBill);
		System.out.println("-------------------------------------------------------------");
		System.out.println("\n");
		Payment p =new Payment(totalBill);
				
	}

	
	
		
		
	}

