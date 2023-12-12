package com.testng;

import org.testng.annotations.Test;

public class Demo_3_Invocation 
{
	/**
	 * Invocation count = If user wants to execute same test multiple time he can use invocation count.
	 * Here data will also remain the same
	 */

	@Test(invocationCount = 0)
	public void logintoApp() {
		System.out.println("Logged successfully");
	}
	
	@Test
	public void logintoAppViaAPI() {
		System.out.println("Logged successfully via API");
	}
	
	
}
