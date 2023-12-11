package com.testng;

import org.testng.annotations.Test;

public class Demo_2_Priority 
{
	// Depending on the priority the class will get executed
	// by default execution order is alphabetical
	// lower numbers will execute first
	// By default priority of any test is zero
	
	@Test(priority = 1)
	public void createCustomerSBI() {
		System.out.println("Customer Created");
	}

	
	@Test(priority =2)
	public void modifyCustomerSBI() {
		System.out.println("Customer Modified");
	}


	@Test 
	public void deleteCustomerSBI() {
		System.out.println("Customer Deleted");
	}
	
	@Test(priority=-1)
	public void registerAccountSBI() {
		System.out.println("Registration success");
	}
}
