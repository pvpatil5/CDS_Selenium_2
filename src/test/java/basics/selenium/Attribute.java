package basics.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();

		//		String att=	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).getAttribute("title");
		//		System.out.println(att);

		//	Fetch text from UI ?
		String pageTitle=driver.findElement(By.xpath("//td[@class='moduleName']/a")).getAttribute("text");;
		System.out.println(pageTitle);
		
		
		
		System.out.println("ttt-->"+driver.getTitle());

	}

}
