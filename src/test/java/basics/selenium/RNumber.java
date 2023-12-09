package basics.selenium;

import java.util.Random;

public class RNumber {

	public static void main(String[] args) {

		String orgName="TATA TECH_";
	
		Random r = new Random();
		int number=r.nextInt(1000);
		
		String newOrgName=orgName+Integer.toString(number);

		System.out.println(newOrgName);
	}

}
