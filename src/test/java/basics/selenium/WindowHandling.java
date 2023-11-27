package basics.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://askomdch.com/");

		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Scroll to Bottom
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='https://www.apple.com/in/app-store/']")).click();
		
		Thread.sleep(2000);
		
		// How to handle new window ?
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> iterator = windows.iterator();
		
		String parentWindow=iterator.next();
		String childwindow=iterator.next();
		
		driver.switchTo().window(childwindow);
		
		Thread.sleep(2000);
		driver.findElement(By.id("globalnav-menubutton-link-search")).click();
		
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//a[text()='My Account']")).click();


	}

}
