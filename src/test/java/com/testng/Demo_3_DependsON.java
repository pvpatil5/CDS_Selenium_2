package com.testng;

import org.testng.annotations.Test;

public class Demo_3_DependsON {

	
	@Test()
	public void createCustomerSBI() {
		System.out.println("Customer Created");
		int arr[] = {1,2,3,4};
		System.out.println("**"+arr[5]);
	}

	
	@Test(dependsOnMethods = "createCustomerSBI",alwaysRun = true)
	public void modifyCustomerSBI() {
		System.out.println("Customer Modified");
	}


	@Test (dependsOnMethods = "createCustomerSBI")
	public void deleteCustomerSBI() {
		System.out.println("Customer Deleted");
	}
	
	
}
