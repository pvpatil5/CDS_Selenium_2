package basics.selenium;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='"+today+"']")).click();
	}
	

}
