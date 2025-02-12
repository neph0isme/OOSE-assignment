
public class Reservation {
	
	private String reserveID;
    private String restID;
    private int reservePax;
    private String custname;
    private String custphone;
    private String custemail;
    private boolean reserveStatus;
	private String startTime;
	private String endTime;
	private String date;
	
	//(reservationid, restaurantid, reservepax, custname, nophone, email, status)
	public Reservation(String reserveID, String restID, int reservePax, String date, String startTime, String endTime, String custname, String custphone, String custemail, Boolean reserveStatus) {
		
		this.reserveID = reserveID;
        this.restID = restID;
        this.reservePax = reservePax;
        this.startTime = startTime;
        this.endTime = endTime;
        this.custname = custname;
        this.custphone = custphone;
        this.custemail = custemail;
        this.reserveStatus = reserveStatus;
        
	}
	
	//start time, end time
	
	public String getEndTime() {
		return endTime;
		
	}
	
	public void setEndTime(String selectedEndTime) {
		endTime = selectedEndTime;
		
	}
	
	public String getStartTime() {
		return startTime;
		
	}
	
	public void setStartTime(String selectedStartTime) {
		startTime = selectedStartTime;
	}
	
	
	public String getDate() {
		return date;
		
	}
	
	public void setDate(String selectedDate) {
		date = selectedDate;
	}
	
	public String getReserveID() {
        return reserveID;
    }

    public void setReserveID(String reserveID) {
        this.reserveID = reserveID;
    }

    public String getRestaurantID() {
        return restID;
    }

    public void setRestaurantID(String restaurantID) {
        restID = restaurantID;
    }

    public int getReservePax() {
        return reservePax;
    }

    public void setReservePax(int reservePax) {
        this.reservePax = reservePax;
    }

    public String getCustName() {
        return custname;
    }

    public void setCustName(String custName) {
        custname = custName;
    }

    public String getCustPhone() {
        return custphone;
    }

    public void setCustPhone(String custPhone) {
        custphone = custPhone;
    }

    public String getCustEmail() {
        return custemail;
    }

    public void setCustEmail(String custEmail) {
        custemail = custEmail;
    }

    public boolean isReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(boolean reserveStatus) {
        this.reserveStatus = reserveStatus;
    }

	

	

}
