import java.util.ArrayList;


public class database {
    private static ArrayList<Customer> customerList = new ArrayList<Customer>();
    private static ArrayList<Staff> staffList = new ArrayList<Staff>();
    //static ArrayList<Restaurant> restaurants = new ArrayList<>();
    //static ArrayList<Reservation> reservations = new ArrayList<>();

    
    // Pre-Stored Restaurant Login info:
    
    //String staffID, String name, String password
    Staff staff1 = new Staff("R001", "Amiezah", "rest123");
    Staff staff2 = new Staff("R002", "Harris", "rest456");
    
    //String custID, String name, String email, String phoneNumber, String password
    Customer c1 = new Customer("liana02", "Liana Johari", "liana@gmail.com", "0122234466", "121212" );
    Customer c2 = new Customer("zulanep", "Zulhanif Ramli", "zul@gmail.com", "0165523433", "110404");
    
    //to validate login 
    public boolean validateCustomerLogin(String custID, String pass) {
    	for (Customer c : customers) {
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
    (nama rest, type of cuisine, location, numofpax, rating)*/
    
    /*Cust info:
     (nama, no phone, email)*/
    
    /*reservation 
     (reservationid, restaurantid, reservepax, custname, nophone, email, status)*/
    
    /*reservation (pov staff)
    (reservationid, reservepax, custname, nophone, email, status)*/
    
    
    
    
    
    
    
    public database() { //constructor
    
    //add to array
    staffList.add(staff1);
	staffList.add(staff2);
	
	customerList.add(c1);
	customerList.add(c2);
	
    }
    
 // Additional Methods (Optional)
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

	public static Customer getCustomer(String custID, String password) {
		for (Customer customer : customerList) {
			if (customer.getCustID().equals(custID) &&
				customer.getPassword().equals(password)) {
				return customer;
			}
		}
		
		return null;
	}

    
}
