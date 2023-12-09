package genericMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumGenericMedhods 
{
	public static WebDriver driver=null;
	public static WebDriver launchBrowser(String browserName,String url)
	{

		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}


	

	public static  void mouseHover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();	
	}

	public static void selectVisibleText(By by,String text) {
		
		Select select = new Select(driver.findElement(by));
		select.selectByVisibleText(text);
	}

	public static void selectValue(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static void selectIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void enterData(By by,String data) {
		driver.findElement(by).sendKeys(data);
	}

	public static void clickEleemnt(By by) {
		driver.findElement(by).click();
	}
	
	public String getTextFromUI(By by) {
		return driver.findElement(by).getText();
	}

	public String getAttributeFromUI(By by,String attributeName)
	{
		return driver.findElement(by).getAttribute(attributeName);
	}
	
	






}
