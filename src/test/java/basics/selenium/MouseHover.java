package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
	//	WebElement element = driver.findElement(By.xpath("//div[text()='EN']"));
	
//		Actions act = new Actions(driver);
//		act.moveToElement(element).build().perform();
		
		WebElement ele = driver.findElement(By.xpath("//a[@href='https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0']"));

		Actions act=new Actions(driver);
		//act.moveToElement(ele).build().perform();
			act.contextClick(driver.findElement(By.xpath("//a[text()='Sell']"))).build().perform();
		//driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		//setTimeout(function(){debugger;},5000);
		
		//
		
	}

}
