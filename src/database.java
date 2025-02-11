import java.util.ArrayList;

public class database {
    private static ArrayList<Customer> customerList = new ArrayList<>();
    private static ArrayList<Staff> staffList = new ArrayList<>();
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();
    private static ArrayList<Reservation> reservations = new ArrayList<>();

    // Pre-Stored Staff Login info:
    Staff staff1 = new Staff("R001", "Amiezah", "rest123");
    Staff staff2 = new Staff("R002", "Harris", "rest456");

    // Pre-Stored Customers:
    Customer c1 = new Customer("liana02", "Liana Johari", "liana@gmail.com", "0122234466", "121212");
    Customer c2 = new Customer("zulanep", "Zulhanif Ramli", "zul@gmail.com", "0165523433", "110404");

    // Pre-Stored Restaurant info:
    Restaurant rest1 = new Restaurant("Sushi Paradise", "Japanese Cuisine", "Shah Alam, Selangor", 80, 0.0);
    Restaurant rest2 = new Restaurant("Pasta Anjay", "Italian Cuisine", "Nilai, Negeri Sembilan", 60, 0.0);

    // Pre-Stored Reservations:
    Reservation reserve1 = new Reservation("B001", "R001", 4, "Zulhanif Ramli", "0165523433", "zul@gmail.com", true);
    Reservation reserve2 = new Reservation("B002", "R002", 2, "Liana Johari", "0122234466", "liana@gmail.com", false);

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
}


/*
import java.util.ArrayList;


public class database {
    private static ArrayList<Customer> customerList = new ArrayList<Customer>();
    private static ArrayList<Staff> staffList = new ArrayList<Staff>();
    private static ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
    private static ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    // Pre-Stored Restaurant Login info:
    
    //String staffID, String name, String password
    Staff staff1 = new Staff("R001", "Amiezah", "rest123");
    Staff staff2 = new Staff("R002", "Harris", "rest456");
    
    //String custID, String name, String email, String phoneNumber, String password
    Customer c1 = new Customer("liana02", "Liana Johari", "liana@gmail.com", "0122234466", "121212" );
    Customer c2 = new Customer("zulanep", "Zulhanif Ramli", "zul@gmail.com", "0165523433", "110404");
    
    //to validate login 
    public boolean validateCustomerLogin(String custID, String pass) {
    	for (Customer c : customerList) {
    		if(c.getUserID().equals(custID) && c.getPassword().equals(pass)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean validateStaffLogin(String restID, String pass) {
    	for (Staff c : staffList) {
    		if(c.getUserID().equals(restID) && c.getPassword().equals(pass)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    
    /*Restaurant info:
    (nama rest, type of cuisine, location, numofpax, rating) /
    
    Restaurant rest1 = new Restaurant("Sushi Paradise", "Japanese Cuisine", "Shah Alam, Selangor", 80, 0.0);
    Restaurant rest2 = new Restaurant("Pasta Anjay", "Italian Cuisine", "Nilai, Negeri Sembilan", 60, 0.0);		
    		
    /*Cust info:
     (nama, no phone, email) /
    
    		
    /*reservation 
     (reservationid, restaurantid, reservepax, custname, nophone, email, status) /
    Reservation reserve1 = new Reservation("B001", "R001", 4, "Zulhanif Ramli", "0165523433", "zul@gmail.com", true);
    
    
    /*reservation (pov staff)
    (reservationid, reservepax, custname, nophone, email, status) /
    
    
    
    
    
    
    
    public database() { //constructor
    
    //add to array
    staffList.add(staff1);
	staffList.add(staff2);
	
	customerList.add(c1);
	customerList.add(c2);
	
	restaurants.add(rest1);
    restaurants.add(rest2);

    reservations.add(reserve1);
	
    }
    
 // Additional Methods (Optional)
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
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

	public static Customer getCustomer(String custID, String password) {
		for (Customer customer : customerList) {
			if (customer.getUserID().equals(custID) &&
				customer.getPassword().equals(password)) {
				return customer;
			}
		}
		
		return null;
	}
	
	public void updateRestaurant(Restaurant updatedRestaurant) {
	    for (int i = 0; i < restaurants.size(); i++) {
	        if (restaurants.get(i).getName().equals(updatedRestaurant.getName())) { // Assuming name is unique
	            restaurants.set(i, updatedRestaurant);
	            break;
	        }
	    }
	}

    
}
*/
