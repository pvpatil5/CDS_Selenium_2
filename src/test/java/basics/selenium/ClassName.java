package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");

		driver.manage().window().maximize();

		//locators --> className
		Thread.sleep(2000);
		
		driver.findElement(By.className("nav-link dropdown-toggle")).click();
		
		
	}

}
