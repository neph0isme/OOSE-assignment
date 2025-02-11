
public class Customer extends User {
	private String custID;
	
	public Customer(String custID, String name, String email, String phoneNumber, String password) {
		super(name, email, phoneNumber, password);
		
		this.custID = custID;
	}
	
	public String getCustID() {
		return custID;
	}
	
	public void setCustID(String newCustID) {
		this.custID = newCustID;
	}
	
	
}
