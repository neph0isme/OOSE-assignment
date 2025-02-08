import java.util.ArrayList;


public class database {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<RestaurantStaff> staffList = new ArrayList<RestaurantStaff>();
    //static ArrayList<Restaurant> restaurants = new ArrayList<>();
    //static ArrayList<Reservation> reservations = new ArrayList<>();

    
    // Pre-Stored Restaurant Login info:
    RestaurantStaff staff1 = new RestaurantStaff("R001", "rest123");
    RestaurantStaff staff2 = new RestaurantStaff("R002", "rest456");
    Customer c1 = new Customer("liana02","121212");
    Customer c2 = new Customer("zulanep","110404");
    
    /*Restaurant info:
    (nama rest, type of cuisine, location, numofpax)*/
    
    /*Cust info:
     (nama, no phone, email)*/
    
    /*reservation 
     (reservationid, restaurantid, reservepax, custname, nophone, email, status)*/
    
    /*reservation (pov staff)
    (reservationid, reservepax, custname, nophone, email, status)*/
    
    
    
    
    
    
    
    public database() { //constructor
    
    //add to arraylist 
    staffList.add(staff1);
	staffList.add(staff2);
	
	customers.add(c1);
	customers.add(c2);
	
    }

    
}
