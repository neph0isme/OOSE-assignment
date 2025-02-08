

public class MainController {
	private CustomerController customerController;
	private StaffController staffController;
	private Database database;

	private LoginView loginView;
	private ErrorLoginView errorLoginView;
	
	public MainController() {
		this.database = new Database();
		this.customerController = new CustomerController(this, database);
		this.StaffController = new LecturerController(this, database);

		loginView = new LoginView(this);
		errorLoginView = new ErrorLoginView(this);
	}
	
	public static void main(String[] args) {
		MainController mainController = new MainController();
		mainController.displayLoginView();
	}
	
	public void displayLoginView() {
		loginView.display();
	}
	
	public void displayErrorLoginView() {
		errorLoginView.display();
	}
	
	public void loginStudent(String matricNumber, String password) {
		studentController.login(matricNumber, password);
	}
	
	public void loginLecturer(String staffID, String password) {
		lecturerController.login(staffID, password);
	}
}
