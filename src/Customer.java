
public class Customer extends User {
	private String email;
	private String phoneNumber;
	
	public Customer(String custID, String name, String email, String phoneNumber, String password) {
		super(custID, name, password);
		
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }
	
	
}
