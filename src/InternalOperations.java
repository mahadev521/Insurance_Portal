import java.util.Scanner;

public class InternalOperations {
	static Scanner sc = new Scanner(System.in);

	public static Customer createCustomer() {
		Customer customer = new Customer();
		System.out.println("Customer ID: " + customer.getCustomerId());
		System.out.print("Enter name: ");
		customer.setName(sc.nextLine());
		System.out.print("Enter email: ");
		customer.setEmail(sc.nextLine());
		System.out.print("Enter password: ");
		customer.setPassword(sc.nextLine());
		System.out.print("Enter Address: ");
		customer.setAddress(sc.nextLine());
		System.out.print("Enter contact number: ");
		customer.setContactNumber(sc.nextLine());
		System.out.print("Enter nominee name: ");
		customer.setNomineeName(sc.nextLine());
		System.out.print("Enter relationship with nominee: ");
		customer.setNomineeRelation(sc.nextLine());
		System.out.println("confirm registration (y/n)? ");
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
