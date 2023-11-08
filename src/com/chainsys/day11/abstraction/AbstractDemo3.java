package com.chainsys.day11.abstraction;

import java.util.Scanner;

import com.chainsys.practiseday7.methods.MobileNoFileValidation;

abstract class Employee{
	protected String name;
	protected double baseSalary;
	protected double hra;
	protected double conveyanceAllowance;
	protected double professionalTax;
	public Employee(String name,double baseSalary,double hra,double cAllowance,double pTax) {
		this.name=name;
		this.baseSalary=baseSalary;
		this.hra=hra;
		this.conveyanceAllowance=cAllowance;
		this.professionalTax=pTax;
	}
	
	abstract double calculateSalary();
	abstract void displayInfo();
	public boolean validation() {
		if (name != null && baseSalary>0 && hra > 0 && conveyanceAllowance>=0 && professionalTax >= 0 ) {
			return true;
		} else {
            return false;
		}
	}
	
}

class Manager extends Employee{
	//private double bonus;
	public Manager(String name,double baseSalary,double hra,double cAllowance,double pTax) {
		super(name, baseSalary,cAllowance,hra,pTax);
		//this.bonus=bonus;
	}
	@Override
	double calculateSalary() {

		double totalSalary =( baseSalary+conveyanceAllowance+hra)-professionalTax;
		return totalSalary;
		
	}
	@Override
	void displayInfo() {
		boolean isValid = validation();
		if (isValid==true) {
			System.out.println("Manager Name : "+name);
			System.out.println("Salary : $"+baseSalary);
			//System.out.println(" Bonus : $"+bonus);
			System.out.println(" HRA : $"+hra);
			System.out.println("Conveyance Allowance : $"+conveyanceAllowance);
			System.out.println("Professional Tax : $"+professionalTax);
			System.out.println("Manager TotalSalaty : $"+calculateSalary());
			
		} else {
           System.out.println("Invalided code...");
		}
		
	}
}

class Programmer extends Employee{
	private int overTimeHours;
	private double hourPerRate;

	
	public Programmer(String name,double baseSalary,int overTimeHours,double hourPerRate,double hra,double cAllowance,double pTax) {
		super(name,baseSalary,hra,cAllowance,pTax);
		this.overTimeHours=overTimeHours;
		this.hourPerRate=hourPerRate;
	}

	@Override
	double calculateSalary() {
		double hike;
		double totalSalary = baseSalary+(overTimeHours*hourPerRate)+conveyanceAllowance+hra-professionalTax;
		hike  = totalSalary*10/100;
		if (overTimeHours > 10) {
			System.out.println("Hike : $"+hike);
			return totalSalary+=hike;
			
			
		}
		return totalSalary;
	}

	@Override
	void displayInfo() {
		boolean isValid = validation();
		if (isValid==true) {
			System.out.println("Programmer Name : "+name);
			System.out.println("Programmer Salary : $"+baseSalary);
			System.out.println("Programmer OverTimeHours : "+overTimeHours+"hrs");
			System.out.println("Hours Per Rate : $"+hourPerRate);
			System.out.println("Programmer TotalSalaty : $"+calculateSalary());

		} else {
           System.out.println("Invalided code...");
		}
				
	}
}
public class AbstractDemo3 {

	public static void main(String[] args) {
		Employee manager = new Manager("Smith", 40000,2000,500,100);  
         manager.displayInfo();
         System.out.println("------------------------------------------");
        Employee programmer = new Programmer("Adam", 20000, 10, 500,1000,500,100);
         programmer.displayInfo();
	}

}
