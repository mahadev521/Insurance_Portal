import java.util.Random;
import java.util.Scanner;

public class Utility {
	static Scanner sc = new Scanner(System.in);

	public static String setStringParameter(String parameterName) {
		String value;
		System.out.print("enter " + parameterName + ": ");
		value = sc.nextLine();
		while (value.equals("")) {
			System.out.println(parameterName + " required.! ");
			System.out.print("enter " + parameterName + ": ");
			value = sc.nextLine();
		}
		return value;
	}

	public static int generateRandomNumber() {
		Random random = new Random();
		int min = 100_000, max = 999_999;
		return random.nextInt(max - min + 1) + min;
	}
}
