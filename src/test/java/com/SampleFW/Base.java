package com.SampleFW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base 
{
	WebDriver driver = null;
	
	@BeforeMethod
	public void LoginToApp() {
		System.out.println("Logged iN ");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
	}

	@AfterMethod
	public void LogOutandCloseBrowser() {
		System.out.println("browser closed");
	}

//	@Parameters({"environment","browser"})
	// String env,String browserName
	@BeforeClass
	public void beforeClass() {
	String	browserName="chrome";
		System.out.println("before class executed");
	//	System.out.println("Test are executing on env="+ env);
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();
		}

		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}


	@AfterClass
	public void afterClass() {
		System.out.println("after class executed");
	}


	@BeforeTest
	public void beforeTest() {
		
	
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test executed");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}


}
