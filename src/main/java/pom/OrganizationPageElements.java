package pom;

import org.openqa.selenium.By;

public interface OrganizationPageElements 
{

	By createOrgBtn=By.xpath("//img[@alt='Create Organization...']");
	By searchOrgTextBox= By.name("search_text");
	By orgtypeDD=By.id("bas_searchfield");
	By searchOrgBtn= By.name("submit");
	By searchedOrgText=By.xpath("(//a[@title='Organizations'])[1]");
	
	
	
	
}
