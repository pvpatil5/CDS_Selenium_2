package genericMethods;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

	
	public static  void loginToApplication() throws IOException {
		driver.findElement(By.name("user_name")).sendKeys(PropertyFileHandling.readDataPropFile("username"));
		driver.findElement(By.name("user_password")).sendKeys(PropertyFileHandling.readDataPropFile("password"));
		driver.findElement(By.id("submitButton")).click();
	}

}
