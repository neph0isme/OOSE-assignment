
public class Restaurant {
	private String restaurantID;
	private String restaurantName;
	private String location;
	private int restPax;
	private double rating;
	private String cuisine;
	private String staffID;

	//(nama rest, type of cuisine, location, numofpax, rating)
	public Restaurant(String restaurantID, String restaurantName, String cuisine, String location, int restPax, double rating, String staffID) {
		this.restaurantID = restaurantID;
		this.restaurantName = restaurantName;
		this.location = location;
		this.restPax = restPax;
		this.cuisine = cuisine;
		this.rating = rating;
		this.staffID = staffID;
	}
	
	public String getStaffID() {
		return staffID;
	}
	
	public String getRestaurantID() {
        return restaurantID;
    }
	
	public String getName() {
        return restaurantName;
    }

    public void setName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCuisineType() {
        return cuisine;
    }

    public void setCuisineType(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRestPax() {
        return restPax;
    }

    public void setRestPax(int restPax) {
        this.restPax = restPax;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
	
	
}
