
public class User {
	private String userID;
    private String name;
    private String password;
	
	public User(String userID, String name, String password) {
		this.userID = userID;
        this.name = name;
        this.password = password;
	}

	public String getUserID() {
        return userID;
    }

    public void setUserID(String newUserID) {
        this.userID = newUserID;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}

