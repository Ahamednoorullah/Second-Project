package com.chainsys.day9.encapsul;

public class Product {  
     private String pname;  
     private int qty;  
     private double price;  
     private double totalPrice;
     
     public Product() {
		
	}
     
    public Product(String pname,int qty,double price,double totalPrice) {
		this.pname=pname;
		this.qty=qty;
		this.price=price;
		this.totalPrice=totalPrice;
		}
    
    public String getProductName() {return pname;}
    public int getQuantity() {return qty;}
    public double getPrice() {return price;}
    public double getTotalPrice() {return totalPrice;}
    
    
    public static void displayFormat() {
    	System.out.println("......................................................................................."
    			+ "");
    	System.out.print("\nName\t\tQuantity\t\tRate\t\t\t\tTotal Price\n");
    	System.out.println("............................................................................................");
    }
    
    public void display()   
    {  
        System.out.format(" %-9s      %5d               %9.2f                       %14.2f\n" , pname, qty, price, totalPrice);  
    }  
}
