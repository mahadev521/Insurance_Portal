import java.util.Scanner;

public class InternalOperations {
	static Scanner sc = new Scanner(System.in);

	public static Customer createCustomer() {
		Customer customer = new Customer();
		System.out.println("Customer ID: " + customer.getCustomerId());
		customer.setName();
		customer.setEmail();
		customer.setPassword();
		customer.setAddress();
		customer.setContactNumber();
		customer.setNomineeName();
		customer.setNomineeRelation();
		System.out.print("confirm registration (y/n): ");
		if (sc.next().equals("y")) {
			return customer;
		} else {
			return null;
		}
	}

	public static void registrationSucess(Customer customer) {
		printCompanyName();
		System.out.println("Registration Sucessful");
		System.out.println("ID: " + customer.getCustomerId());
		System.out.println("Name: " + customer.getName());
		System.out.println("email: " + customer.getEmail());
	}

	public static void printCompanyName() {
		System.out.println("\nQXY Insurance Portal");
	}

	public static void newRegistration() {
		Customer customer = createCustomer();
		if (customer != null) {
			registrationSucess(customer);
			Resources.addCustomer(customer.getCustomerId(), customer);
		} else {
			System.out.println("Registration failed");
		}
	}

	public static void displayDetailsOfCustomer(Customer customer) {
		System.out.println(customer.toString());
	}

}
