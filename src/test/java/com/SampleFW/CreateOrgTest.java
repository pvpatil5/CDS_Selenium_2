package com.SampleFW;

import org.testng.annotations.Test;

public class CreateOrgTest{

	@Test(groups={"regression","smoke"})
	public void createOrg_WithEmail() {
		System.out.println("Org created");
	}
	
	
	@Test(groups = "smoke")
	public void createOrg_WithPhone() {
		System.out.println("Org created with Phone");
	}
	

	@Test(groups = "sanity")
	public void createOrg_WithCouponCode() {
		System.out.println("Org created with Coupon code");
	}
	
}
