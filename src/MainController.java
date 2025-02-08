

public class MainController {
	private StudentController studentController;
	private LecturerController lecturerController;
	private Database database;

	private LoginView loginView;
	private ErrorLoginView errorLoginView;
	
	public MainController() {
		this.database = new Database();
		this.studentController = new StudentController(this, database);
		this.lecturerController = new LecturerController(this, database);

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
