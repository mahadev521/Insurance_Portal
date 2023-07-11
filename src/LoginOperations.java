import java.util.Scanner;

public class LoginOperations {
	static Scanner scanner =new Scanner(System.in);
	public static Customer customerLogin() {
		int id;
		String password;
		InternalOperations.printCompanyName();
		System.out.println("Login portal");
		System.out.print("Enter ID: ");
		id=scanner.nextInt();
		System.out.print("Enter password: ");
		password=scanner.next();
		if(Resources.LoginData.get(id).getPassword().equals(password)) {
			return Resources.LoginData.get(id);
		}
		return null;
	}
}
