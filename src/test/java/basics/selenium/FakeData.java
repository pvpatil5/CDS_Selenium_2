package basics.selenium;

import com.github.javafaker.Faker;

public class FakeData {

	public static void main(String[] args) {

		Faker faker = new Faker();
		
		System.out.println(faker.name().fullName());

		System.out.println(faker.address().cityName());
		
		System.out.println(faker.phoneNumber().cellPhone());
		
		System.out.println(faker.company().name());

	}

}
