package basics.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// go to some website
		
		driver.get("https://selenium.dev");
		
		//maximise window
		
		driver.manage().window().maximize();
		
		Thread.sleep(2500);
		
		driver.manage().window().minimize();
		
		// close browser
		//driver.close();

	}

}
