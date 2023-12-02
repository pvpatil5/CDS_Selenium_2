package basics.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropFile {

	public static void main(String[] args) throws IOException 
	{
		String environment="QA";

		//String environment="Staging";

		FileInputStream fis = new FileInputStream("../LearnSelenium/src/test/resources/inputData/TestData_"+environment+".properties");	

		Properties prop = new Properties();
		prop.load(fis);

		String v1=(String) prop.get("token");

		System.out.println(v1);

	}

}
