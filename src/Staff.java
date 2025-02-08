
public class Staff extends User {
	private String staffID;
	
	public Staff(String staffID, String name, String email, String phoneNumber, String password) {
		super(name, email, phoneNumber, password);
		
		this.staffID = staffID;
	}
	
	public String getMatricNumber() {
		return staffID;
	}
	
	public void setMatricNumber(String newStaffID) {
		this.staffID = newStaffID;
	}
	
	
}
