package com.Vtiger.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOrganizationTest {

	public static void main(String[] args) throws InterruptedException {
		//Login App
		//Validate Home Page
		//Click on Org menu
		// click on create org
		// enter org info
		// save
		//validate 
		//logout



		//Launch Browser 
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Login code
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();

		//Login Validate
		String pagetitle=driver.findElement(By.xpath("//a[@href='index.php?action=index&module=Home']")).getText();

		if(pagetitle.contains("Home")) {
			System.out.println("Step Pass");
		}
		else {
			System.out.println("StepFail");
		}

		//click on org
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();

		//validate org landing page
		boolean flag = driver.findElement(By.xpath("//a[@href='index.php?action=ListView&module=Accounts&parenttab=Marketing']")).isDisplayed();
		if(flag) {
			System.out.println("Org page disp");
		}
		else {
			System.out.println("Org page not disp");
		}

		// click on create org

		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();

		//enter org name

		String orgName="TATA TECH_3";
		driver.findElement(By.name("accountname")).sendKeys(orgName);

		driver.findElement(By.xpath("//input[@accesskey='S']")).click();

		Thread.sleep(3000);
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();

		// valiadte org is created

		driver.findElement(By.name("search_text")).sendKeys(orgName);

		WebElement ddelement = driver.findElement(By.id("bas_searchfield"));

		Select select = new Select(ddelement);
		select.selectByValue("accountname");

		driver.findElement(By.name("submit")).click();

		Thread.sleep(3000);
		
		String actualOrgName=driver.findElement(By.xpath("(//a[@title='Organizations'])[1]")).getText();
		
		System.out.println("-->"+actualOrgName);
		
		if(actualOrgName.contains(orgName)) {
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}



	}

}
