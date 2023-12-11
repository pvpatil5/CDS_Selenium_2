package com.Vtiger.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import genericMethods.PropertyFileHandling;
import genericMethods.SeleniumGenericMedhods;

public class CreateContactWithOrgTest extends SeleniumGenericMedhods{

	public static void main(String[] args) throws IOException {
		String browser=PropertyFileHandling.readDataPropFile("browser");
		String url=PropertyFileHandling.readDataPropFile("url");;
		WebDriver driver = SeleniumGenericMedhods.launchBrowser(browser,url);
		//Login code
	

	}
}
