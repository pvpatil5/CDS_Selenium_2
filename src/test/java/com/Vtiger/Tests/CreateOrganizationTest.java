package com.Vtiger.Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import basics.selenium.MouseHover;
import genericMethods.CreateRandomNumber;
import genericMethods.PropertyFileHandling;
import genericMethods.SeleniumGenericMedhods;

public class CreateOrganizationTest extends SeleniumGenericMedhods {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Login App
		//Validate Home Page
		//Click on Org menu
		// click on create org
		// enter org info
		// save
		//validate 
		//logout


		String browser=PropertyFileHandling.readDataPropFile("browser");
		String url=PropertyFileHandling.readDataPropFile("url");;
		WebDriver driver = SeleniumGenericMedhods.launchBrowser(browser,url);
		//Login code
		

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
		String number=CreateRandomNumber.randomnumber();
		String orgname="TATA TECH_";
		String orgName=orgname+number;
		
		
		//driver.findElement(By.name("accountname")).sendKeys(orgName);
		
		enterData(By.name("accountname"), orgName);

	//	driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		clickEleemnt(By.xpath("//input[@accesskey='S']"));

		Thread.sleep(3000);
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();

		// valiadte org is created

		driver.findElement(By.name("search_text")).sendKeys(orgName);

		WebElement ddelement = driver.findElement(By.id("bas_searchfield"));

		//selectVisibleText(ddelement, "accountname");

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

		//Logout & close browser
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		mouseHover(ele);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		
		
		
	}

}
