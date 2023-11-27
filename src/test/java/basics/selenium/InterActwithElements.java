package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterActwithElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		//locators --> id,Name,className,TagName,linktext
		Thread.sleep(4000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		//tagname[text()='ValueOfText']
		
		
	}

}
