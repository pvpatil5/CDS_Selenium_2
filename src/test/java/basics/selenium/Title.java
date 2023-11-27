package basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {

		//		WebDriver driver = new ChromeDriver();
		//		driver.manage().window().maximize();
		//		driver.get("https://flipkart.com");
		//
		//		// It will return title of the page
		//		System.out.println(driver.getTitle());
		//
		//
		//		String curl=driver.getCurrentUrl();
		//		System.out.println(curl);


		String str= "MaHa!raShT#RA";
		String temp="";
		int count=1;
		char arr[]=str.toCharArray();

		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i)	;
			if(Character.isLowerCase(ch)) 
			{
				char ch1=Character.toUpperCase(ch);
				temp=temp+ch1;
			}
			if(Character.isUpperCase(ch)) 
			{
				char ch2=Character.toLowerCase(ch);
				temp=temp+ch2;
			}
			if(!Character.isLetter(ch))
			{
				ch=(char) (count+'0');
				count++;
				temp=temp+ch;
			}
		}
		System.out.println(temp);


	}

}
