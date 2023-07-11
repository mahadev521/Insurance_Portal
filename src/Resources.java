import java.util.HashMap;

public class Resources {
	public static HashMap<Integer,Customer> LoginData = new HashMap<>();
	
	public static void addCustomer(int number, Customer customer) {
		LoginData.put(number, customer);
	}
	
	public static boolean isIdExists(int number) {
		return LoginData.containsKey(number);
	}
}
