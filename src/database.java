import java.util.ArrayList;


public class database {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<Staff> staffList = new ArrayList<Staff>();
    //static ArrayList<Restaurant> restaurants = new ArrayList<>();
    //static ArrayList<Reservation> reservations = new ArrayList<>();

    
    // Pre-Stored Restaurant Login info:
    
    //String staffID, String name, String email, String password
    Staff staff1 = new Staff("R001", "Amiezah", "amie@gmail.com", "rest123");
    Staff staff2 = new Staff("R002", "Harris", "harris@gmail.com", "rest456");
    
    //String custID, String name, String email, String phoneNumber, String password
    Customer c1 = new Customer("liana02", "Liana Johari", "liana@gmail.com", "0122234466", "121212" );
    Customer c2 = new Customer("zulanep", "Zulhanif Ramli", "zul@gmail.com", "0165523433", "110404");
    
    /*Restaurant info:
    (nama rest, type of cuisine, location, numofpax)*/
    
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
	
	customers.add(c1);
	customers.add(c2);
	
    }

    
}
