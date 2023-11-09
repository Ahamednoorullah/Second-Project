package com.chainsys.day12.inheritence;
class Employee{
	private String name;
	private String address;
	private double salary;
	private String jobTitle;
	
	public Employee(String name,String address,double salary,String jobTitle) {
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.jobTitle=jobTitle;
	}
	
	public String getName() {return name;}
	public String getAddress() {return address;}
	public double getSalary() {return salary;}
	public String getJobTitle() {return jobTitle;}
	
	public double calculateBonus() { 
		return 0.0;
	}
	
	public String generatePerformanceReport() {
		return "No Performance Report Available.";
	}
	
}
class Manager extends Employee{
	private int numberOfSubordinates;
	
	public Manager(String name, String address, double salary, String jobTitle,int numberOfSubordinates) {
		super(name, address, salary, jobTitle);
		this.numberOfSubordinates=numberOfSubordinates;
	}
	
	public int getNUmberOfSubordinates() {return numberOfSubordinates;}
	
	@Override
	public double calculateBonus() {
		
		return getSalary()*0.15;
	}

	@Override
	public String generatePerformanceReport() {
		
		return "Performance report for Manager " + getName() + ": Excellent";
	}
	
	public void manageProject() {
        
        System.out.println("Manager " + getName() + " is managing a project.");
    }
	
	public void displayInfo() {
		System.out.println("Manager Name : "+getName());
		System.out.println("Address : "+getAddress());
		System.out.println("Salary : "+getSalary());
		System.out.println("Job : "+getJobTitle());
		System.out.println(generatePerformanceReport());
		manageProject();
		
	}
	
}

class Developer extends Employee{
	private String programmingLanguage;
	
	public Developer(String name, String address, double salary, String jobTitle,String programmingLanguage) {
		super(name, address, salary, jobTitle);
		this.programmingLanguage=programmingLanguage;
	}

	public String getProgrammingLanguage() {return programmingLanguage;}
	
	@Override
	public double calculateBonus() {
		
		return getSalary()*0.20;
	}
	
	@Override
	public String generatePerformanceReport() {
		return "Performance report for DEveloper " + getName() + ": Good";
	}
	
	  public void writeCode() {
	       
	        System.out.println("Developer " + getName() + " is writing code in " + programmingLanguage);
	    }
	  
		public void displayInfo() {
			System.out.println("Developer Name : "+getName());
			System.out.println("Address : "+getAddress());
			System.out.println("Salary : "+getSalary());
			System.out.println("Job : "+getJobTitle());
			System.out.println(generatePerformanceReport());
			writeCode();
			
		}
}
class Programmer extends Developer{

	public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
		super(name, address, salary, jobTitle, programmingLanguage);
		
	}
	
	@Override
	public double calculateBonus() {
		return super.calculateBonus();
	}
	
@Override
	public String generatePerformanceReport() {
		
		return "Performance report for Programmer " + getName() + ": Good";
	}

public void debugCode() {
    // Custom method for debugging code
    System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
}

public void displayInfo() {
	System.out.println("Programmer Name : "+getName());
	System.out.println("Address : "+getAddress());
	System.out.println("Salary : "+getSalary());
	System.out.println("Job : "+getJobTitle());
	System.out.println(generatePerformanceReport());
	debugCode();
	
}

	
}

public class InheritanceMultilevelDemo {

	public static void main(String[] args) {
		Manager manager = new Manager("Avril Aroldo", "1 ABC St", 80000.0, "Manager",8);
		manager.displayInfo();
		
		System.out.println("_______________________________________________________");
		Developer developer = new Developer("Ahamed", "10,west Street", 50000.0, "Developer", "Java");
		developer.displayInfo();
         
		System.out.println("________________________________________________________");
		Programmer programmer = new Programmer("John", "22,East Road,chennai", 45000.0, "Programmer", "Python");
		programmer.displayInfo();

	}

}
