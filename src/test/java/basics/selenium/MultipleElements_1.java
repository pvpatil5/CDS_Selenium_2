package basics.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@placeholder='What are you looking for ?']")).click();

		List<WebElement> ref = driver.findElements(By.xpath("//ul[@class='UL--wdbnwf jvsifO']//li//a"));

		for (int i = 0; i < ref.size(); i++) {
			String value=	ref.get(i).getText();
			if(value.equalsIgnoreCase("Mens Sunglasses")) {
				ref.get(i).click();
			}

		}

	}

}
