package com.chainsys.practiseday8.modifiers;

/*Write a Java program to create a class called Employee with 
 *private instance variables employee_id, employee_name, and employee_salary.
 *Provide public getter and setter methods to access and modify the id and name 
 *variables, but provide a getter method for the salary variable that returns a formatted string.
 * 
 */
class Employee{
	String employeeName;
	int employeeId;
	double employeeSalary;
	
	public String getEmployeeName() {return employeeName;}
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	
	public int getEmployeeId() {return employeeId;}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public double getEmployeeSalary() {return employeeSalary;}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary=employeeSalary;
	}
	
	public String getFormatSalary() {
		return String.format("$%.2f",employeeSalary);
	}
}

public class EncapsulLearning {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmployeeName("Smith");
		employee.setEmployeeId(1001);
		employee.setEmployeeSalary(49000.0);
		
		String employeeName = employee.getEmployeeName();
		int employeeId = employee.getEmployeeId();
		String formatSalary = employee.getFormatSalary();
		
		System.out.println("Employee Details ");
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Salary : "+formatSalary);

	}

}
