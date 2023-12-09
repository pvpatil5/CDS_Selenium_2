package genericMethods;

import java.util.Random;

public class CreateRandomNumber {

	public static String randomnumber() {

		Random random = new Random();
		int number=random.nextInt(100);
		return Integer.toString(number);

	}

}
