package com.chinesys.practiseday3.first;

class Mobile{
	String mobileName = "Realmi";
	String mobileModel = "MiNote4";
	
	void appInstalled() {
		System.out.println("App is Installed Successfully..");
	}
	
	void settings() {
		System.out.println("Setting is Enabled...");
	}
}

public class MobileAppStore {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		
		System.out.println("Mobile Name = "+m1.mobileName+"\nMobile Model = "+m1.mobileModel);
		m1.appInstalled();
		m1.settings();

	}

}
