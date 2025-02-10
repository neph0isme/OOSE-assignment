
public class Staff extends User {
	private String staffID;
	
	public Staff(String staffID, String name, String email, String password) {
		super(staffID, name, email, password);
		
		this.staffID = staffID;
	}
	
	public String getStaffID() {
		return staffID;
	}
	
	public void setStaffID(String newStaffID) {
		this.staffID = newStaffID;
	}
	
	
}
