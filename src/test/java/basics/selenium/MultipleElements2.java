package basics.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	driver.findElement(By.id("searchDropdownBox")).click();
		
		List<WebElement> ref = driver.findElements(By.xpath("//td[@class='communityLinks']/a"));
		Thread.sleep(2000);
		for (int i = 0; i < ref.size(); i++) {
			ref.get(i).click();
			
		}
		Thread.sleep(4000);
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> ref1=windows.iterator();
		
		while (ref1.hasNext()) {
			String winId=ref1.next();
			driver.switchTo().window(winId);
			System.out.println(driver.getTitle());
			
			
		}
//		vtiger CRM 5 - Commercial Open Source CRM
//		Vtiger CRM | Bangalore | Facebook
//		Recent Discussions — Vtiger
//		Vtiger CRM - YouTube
//		Vtiger CRM - vtiger
//		LinkedIn Login, Sign in | LinkedIn
//		Vtiger CRM (@vtigercrm) / X
//		CRM Software: Customer Relationship Management | Vtiger CRM


	}

}
