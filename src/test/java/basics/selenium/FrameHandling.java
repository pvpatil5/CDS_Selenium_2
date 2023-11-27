package basics.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.id("cars"));
		//driver.switchTo().frame("iframeResult");
	
		//driver.switchTo().frame(1);
		
		driver.switchTo().frame(element);

		Thread.sleep(1000);
		//WebElement element = driver.findElement(By.id("cars"));
	
		Thread.sleep(1000);
		Select sel = new Select(element);
		sel.selectByVisibleText("Opel");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		
		driver.switchTo().defaultContent();
		
	
	}

}
