
public class Reservation {
	
	private String reserveID;
    private String restID;
    private int reservePax;
    private String custname;
    private String custphone;
    private String custemail;
    private boolean reserveStatus;
	private String date;
	private String startTime;
	private String endTime;
	
	//(reservationid, restaurantid, reservepax, custname, nophone, email, status)
	public Reservation(String reserveID, String restID, int reservePax, String date, String startTime, String endTime, String custname, String custphone, String custemail, Boolean reserveStatus) {
		
		this.reserveID = reserveID;
        this.restID = restID;
        this.reservePax = reservePax;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.custname = custname;
        this.custphone = custphone;
        this.custemail = custemail;
        this.reserveStatus = reserveStatus;
        
	}
	
	//start time, end time
	
	public String getendTime() {
		return endTime;
		
	}
	
	public void setendTime() {
		this.endTime = endTime;
	}
	
	public String getstartTime() {
		return startTime;
		
	}
	
	public void setstartTime() {
		this.startTime = startTime;
	}
	
	
	public String getDate() {
		return reserveID;
		
	}
	
	public void setDate() {
		this.date = date;
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
        this.restID = restID;
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
        this.custname = custname;
    }

    public String getCustPhone() {
        return custphone;
    }

    public void setCustPhone(String custPhone) {
        this.custphone = custphone;
    }

    public String getCustEmail() {
        return custemail;
    }

    public void setCustEmail(String custEmail) {
        this.custemail = custemail;
    }

    public boolean isReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(boolean reserveStatus) {
        this.reserveStatus = reserveStatus;
    }

	

	

}
