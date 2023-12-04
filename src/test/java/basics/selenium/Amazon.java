package basics.selenium;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		
//		
//		Waits
//
//		Implicit wait -->driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); [Web Page. this wait is applicable for all elements.(driver.findelement) ].Pooling time -->500ms
//
//
//		Explicit wait-->This is a conditional Wait.TimeOut Exception.Pooling time -->500ms	
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='close']"))).click();
//
//
//		Fluent wait -->If you want to manipulate pooling time we can go for fluent wait. All methods present in Explicit wait and fluent wait are the same.
//					This is a conditional Wait.TimeOut Exception.
//		
		
		

		Date date = new Date();

		String currentDate = date.toString();
		String[] arr = currentDate.split(" ");

		String day=arr[0];
		String month = arr[1];
		String date_1=arr[2];
		String year =arr[5];
		
		String today=day+" "+month+" "+date_1+" "+year;
		
		System.out.println(today);

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='close']"))).click();
		
	//	driver.findElement(By.xpath("//a[@class='close']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[@class='commonModal__clos']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='"+today+"']")).click();
	
	FluentWait fwait = new FluentWait(driver);
	fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	
	
	
	
	
	
	
	
	
	
	
	}

}
