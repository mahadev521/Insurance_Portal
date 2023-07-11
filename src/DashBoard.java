import java.util.Scanner;

public class DashBoard {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String choice = "y";
		InternalOperations.printCompanyName();
		InternalOperations.newRegistration();
		while (choice.equals("y")) {
			Customer customer = LoginOperations.customerLogin();
			if (customer != null) {
				System.out.println(customer.toString());
				break;
			} else {
				System.out.println("authentication failed try again(y/n)");
				choice = scanner.next();
			}
		}
	}
}
