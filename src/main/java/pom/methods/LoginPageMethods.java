package pom.methods;

import java.io.IOException;

import genericMethods.PropertyFileHandling;
import genericMethods.SeleniumGenericMedhods;
import pom.LoginPageElemets;

public class LoginPageMethods  extends SeleniumGenericMedhods implements LoginPageElemets
{

	
	public static void loginToApplication() throws IOException 
	{
		enterData(userNametxtBox,PropertyFileHandling.readDataPropFile("username"));
		enterData(passwordtxtbox,PropertyFileHandling.readDataPropFile("password"));
		clickEleemnt(loginbtn);
	}
}
