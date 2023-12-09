package pom.methods;

import genericMethods.SeleniumGenericMedhods;
import pom.OrganizationPageElements;

public class OrganizationPageMethods extends SeleniumGenericMedhods implements OrganizationPageElements
{
	public static void searchForOrganization(String orgName)
	{
		enterData(searchOrgTextBox, orgName);
		selectVisibleText(orgtypeDD, "Organization Name");
		clickEleemnt(searchOrgBtn);
	}
	
	public String getOrgName() {
		String OrgName=getTextFromUI(searchedOrgText);
		return OrgName;
	}
}
