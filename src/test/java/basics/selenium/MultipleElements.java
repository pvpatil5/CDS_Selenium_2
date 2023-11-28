package basics.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("searchDropdownBox")).click();
		
		List<WebElement> ref = driver.findElements(By.xpath("//select//option"));
		Thread.sleep(2000);
		for (int i = 0; i < ref.size(); i++) {
			String v1=ref.get(i).getText();
			if(v1.equalsIgnoreCase("Books")) 
			{
				ref.get(i).click();
			}
			
		}
		

	}

}
