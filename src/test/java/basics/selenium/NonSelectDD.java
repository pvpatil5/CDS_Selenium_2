package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonSelectDD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/");

		driver.manage().window().maximize();
		
		//Non Select Tag DD
		
		driver.findElement(By.xpath("//a[text()='About']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/history']")).click();
		
	}

}
