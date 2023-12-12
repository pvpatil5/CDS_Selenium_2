package com.testng;

import org.testng.annotations.Test;

public class Demo_3_Flags 
{
	/**
	 * 
	 */

	@Test(alwaysRun = true)
	public void logintoApp() {
		System.out.println("Logged successfully");
	}
	
	@Test(enabled=true)
	public void logintoAppViaAPI() {
		System.out.println("Logged successfully via API");
	}
	
	@Test(enabled=false)
	public void logintoAppDB() {
		System.out.println("Logged successfully in DB");
	}
}
