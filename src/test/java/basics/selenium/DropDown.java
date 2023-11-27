package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();
		
		// How to handle dd with select tag ?
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='url']"));
		
		Select sel = new Select(dropdown);
		//sel.selectByVisibleText("Books");
		
		sel.selectByIndex(10);
		
		sel.selectByValue("search-alias=hpc");
		
		
	}

}
