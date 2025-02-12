import java.util.ArrayList;

public class database {
    private static ArrayList<Customer> customerList = new ArrayList<>();
    private static ArrayList<Staff> staffList = new ArrayList<>();
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();
    private static ArrayList<Reservation> reservations = new ArrayList<>();

    // Pre-Stored Staff Login info:
    Staff staff1 = new Staff("R001", "Amiezah", "rest123", "REST1");
    Staff staff2 = new Staff("R002", "Harris", "rest456", "REST2");

    // Pre-Stored Customers:
    Customer c1 = new Customer("liana02", "Liana Johari", "liana@gmail.com", "0122234466", "121212");
    Customer c2 = new Customer("zulanep", "Zulhanif Ramli", "zul@gmail.com", "0165523433", "110404");

    // Pre-Stored Restaurant info:
    Restaurant rest1 = new Restaurant("REST1","Sushi Paradise", "Japanese Cuisine", "Shah Alam, Selangor", 80, 0.0, "R001");
    Restaurant rest2 = new Restaurant("REST2","Pasta Anjay", "Italian Cuisine", "Nilai, Negeri Sembilan", 60, 0.0, "R002");

    // Pre-Stored Reservations:
    //String reserveID, String restID, int reservePax, String date, String startTime, String endTime, String custname, String custphone, String custemail, Boolean reserveStatus
    Reservation reserve1 = new Reservation("B001", "R001", 4, "2025 April 20", "14:00","16:00", "Zulhanif Ramli", "0165523433", "zul@gmail.com", true);
    Reservation reserve2 = new Reservation("B002", "R002", 2, "2025 April 12", "20:00","22:00", "Liana Johari", "0122234466", "liana@gmail.com", false);

    // Constructor
    public database() {
        // Add predefined data to the lists
        staffList.add(staff1);
        staffList.add(staff2);

        customerList.add(c1);
        customerList.add(c2);

        restaurants.add(rest1);
        restaurants.add(rest2);

        reservations.add(reserve1);
        reservations.add(reserve2);
    }

    // Method to validate customer login
    public boolean validateCustomerLogin(String custID, String pass) {
        for (Customer c : customerList) {
            if (c.getUserID().equals(custID) && c.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    // Method to validate staff login
    public boolean validateStaffLogin(String restID, String pass) {
        for (Staff c : staffList) {
            if (c.getUserID().equals(restID) && c.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    // Method to retrieve all reservations
    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    // Additional Methods (Optional)
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public ArrayList<Customer> getCustomers() {
        return customerList;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }
    
    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public static Customer getCustomer(String custID, String password) {
        for (Customer customer : customerList) {
            if (customer.getUserID().equals(custID) &&
                customer.getPassword().equals(password)) {
                return customer;
            }
        }
        return null;
    }

    // Method to add a reservation
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }
    
    public void updateRestaurant(Restaurant updatedRestaurant) {
	    for (int i = 0; i < restaurants.size(); i++) {
	        if (restaurants.get(i).getRestaurantID().equals(updatedRestaurant.getRestaurantID())) { // Assuming name is unique
	            restaurants.set(i, updatedRestaurant);
	            break;
	        }
	    }
    }
    
    public Restaurant getRestaurantByStaffID(String staffID) {
        for (Staff s : staffList) {
            if (s.getUserID().equals(staffID)) {
                String restaurantID = s.getRestaurantID();
                for (Restaurant r : restaurants) {
                    if (r.getRestaurantID().equals(restaurantID)) {
                        return r;
                    }
                }
            }
        }
        return null; // If no restaurant found
    
    
    
    }
    
    public Customer getCustomerByUsername(String username) {
        
    	for (Customer c : customerList) {  // Assuming customers is an ArrayList<Customer>
            if (c.getUserID().equals(username)) {
                return c; // Return the matched customer
            }
        }
        return null; // Return null if not found
    }
    
    public void updateReservation(Reservation updatedReservation) {
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).getReserveID().equals(updatedReservation.getReserveID())) {
                reservations.set(i, updatedReservation); // Replace old reservation with updated one
                break;
            }
        }
    }

	public ArrayList<Reservation> getReservationsForCustomer(Customer loggedInCustomer) {
		 
		ArrayList<Reservation> customerReservations = new ArrayList<>();
	    
	    if (loggedInCustomer == null) {
	        System.out.println("Error: loggedInCustomer is null.");
	        return customerReservations;
	    }

	    for (Reservation r : reservations) {
	        System.out.println("Stored reservation email: " + r.getCustEmail()); // Debugging

	        if (r.getCustEmail().equals(loggedInCustomer.getEmail())) {
	            customerReservations.add(r);
	        }
	    }
	    
	    return customerReservations;
	}
    
}





