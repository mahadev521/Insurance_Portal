import java.util.Scanner;

public class LoginOperations {
	static Scanner scanner = new Scanner(System.in);

	public static Customer customerLogin() {
		int id = 0;
		String password = "";
		boolean isValidID = false;
		InternalOperations.printCompanyName();
		System.out.println("Login portal");
		while (id == 0) {
			try {
				System.out.print("Enter ID: ");
				id = scanner.nextInt();
				isValidID = true;
			} catch (Exception e) {
				String choiceString;
				System.out.println("Invalid ID! Try again(y/n)");
				choiceString = scanner.next();
				if (!choiceString.equals("y")) {
					break;
				}
			}
		}
		Customer customer=Resources.LoginData.get(id);
		if (isValidID) {
			password = Utility.setStringParameter("password");
			if(customer==null) return null;
			else if (customer.getPassword().equals(password)) {
				System.out.println("\nLogin Sucessful");
			} else {
				System.out.println("Login Failed");
			}
		}
		return customer;
	}
}
