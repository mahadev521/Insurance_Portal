import java.util.Random;

public class Customer {

	private int customerId;
	private String name;
	private String email;
	private String password;
	private String address;
	private String nomineeName;
	private String nomineeRelation;
	private String contactNumber;

	Customer() {
		customerId = generateRandomNumber();
		if (Resources.isIdExists(customerId)) {
			customerId = generateRandomNumber();
		}
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineeRelation() {
		return nomineeRelation;
	}

	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public static int generateRandomNumber() {
		Random random = new Random();
		int min = 100_000, max = 999_999;
		return random.nextInt(max - min + 1) + min;
	}

	@Override
	public String toString() {
		return "Customer Details\ncustomerId: " + customerId + "\nname: " + name + "\nemail: " + email + "\npassword=" + password
				+ "\naddress: " + address + "\nnomineeName: " + nomineeName + "\nnomineeRelation: " + nomineeRelation
				+ "\ncontactNumber: " + contactNumber;
	}

}
