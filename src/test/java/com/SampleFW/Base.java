package com.SampleFW;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	@BeforeMethod
	public void LoginToApp() {
		System.out.println("Logged iN ");
	}

	@AfterMethod
	public void LogOutandCloseBrowser() {
		System.out.println("browser closed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class executed");
	}
	

	@AfterClass
	public void afterClass() {
		System.out.println("after class executed");
	}

}
