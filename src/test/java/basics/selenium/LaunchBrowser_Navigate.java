package basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser_Navigate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=null ;
		
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			driver= new ChromeDriver();
		}
		if(browser.equals("ff")) {
			driver= new FirefoxDriver();
		}
		if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		
	//	driver.get("https://facebook.com");
		
		driver.navigate().to("https://facebook.com");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://flipkart.com");
		Thread.sleep(2000);
		driver.navigate().to("https://myntra.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		Thread.sleep(2000);
		
		driver.navigate().refresh();

		
	}

}
