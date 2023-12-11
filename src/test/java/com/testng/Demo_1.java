package com.testng;

import org.testng.annotations.Test;

public class Demo_1 
{

	@Test
	public void CreateOrganizationTest() 
	{
		System.out.println("Org Created");
	}
	
	@Test
	public void CreateOrgWithDDTest() {
		System.out.println("Org created with DD");
	}
}
