package pom;

import org.openqa.selenium.By;

public interface HomePageElements {

	By organizationModule=By.xpath("//a[@href='index.php?module=Accounts&action=index']");
	By contactsModule=By.xpath("");

	By userIcon=By.xpath("//img[@src='themes/softed/images/user.PNG']");
	By signOutBtn =By.xpath("//a[@href='index.php?module=Users&action=Logout']");



}
