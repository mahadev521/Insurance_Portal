import java.util.Scanner;

public class Customer {
	static Scanner sc = new Scanner(System.in);
	private int customerId;
	private String name;
	private String email;
	private String password;
	private String address;
	private String nomineeName;
	private String nomineeRelation;
	private String contactNumber;

	Customer() {
		customerId = Utility.generateRandomNumber();
		if (Resources.isIdExists(customerId)) {
			customerId = Utility.generateRandomNumber();
		}
	}

	public void setName() {
		name = Utility.setStringParameter("name");
	}

	public void setPassword() {
		password = Utility.setStringParameter("password");
	}

	public void setEmail() {
		email = Utility.setStringParameter("email");
	}

	public void setAddress() {
		address = Utility.setStringParameter("address");
	}

	public void setContactNumber() {
		contactNumber = Utility.setStringParameter("Contact Number");
	}

	public void setNomineeName() {
		nomineeName = Utility.setStringParameter("Nominee name");
	}

	public void setNomineeRelation() {
		System.out.print("enter Nominee relation: ");
		nomineeRelation = sc.nextLine();
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return address;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public String getNomineeRelation() {
		return nomineeRelation;
	}

	public String getContactNumber() {
		return contactNumber;
	}


	@Override
	public String toString() {
		return "Customer Details\ncustomerId: " + customerId + "\nname: " + name + "\nemail: " + email + "\naddress: "
				+ address + "\nnomineeName: " + nomineeName + "\nnomineeRelation: " + nomineeRelation
				+ "\ncontactNumber: " + contactNumber;
	}

}
