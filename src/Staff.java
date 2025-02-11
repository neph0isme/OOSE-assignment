
public class Staff extends User {
	private String restaurantID;
	
	
	public Staff(String staffID, String name, String password, String restaurantID) {
		super(staffID, name, password);
		this.restaurantID = restaurantID;
		
	}
	
	public String getRestaurantID() {
        return restaurantID;
    }

	
	
}
