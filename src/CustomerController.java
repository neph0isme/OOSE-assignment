import java.util.ArrayList;

public class CustomerController extends userController {
	private Customer customer;
	private viewReserve viewReserve;
	
	public CustomerController(MainController mainController, Database database) {
		super();
		
		viewReserve = new viewReserve(this);
	}
	
	public void login(String custID, String password) {
		customer = database.getCustomer(custID, password);

		if (student != null) this.displayStudentView();                 
		else mainController.displayErrorLoginView();
	}
	
	public void logout() {
		student = null;
		mainController.displayLoginView();
	}
	
	public void displayStudentView() {	
		// Registered Courses
		ArrayList<Registration> registeredList = database.getRegistrations(student.getMatricNumber());
		String[][] registeredArray = new String[registeredList.size()][5];
		for (int i = 0; i < registeredList.size(); i++) {
			Registration registration = registeredList.get(i);
			Course course = registration.getCourse();
			
			registeredArray[i][0] = String.valueOf(i + 1);
			registeredArray[i][1] = course.getCourseCode();
			registeredArray[i][2] = course.getName();
			registeredArray[i][3] = registration.getSession();
			registeredArray[i][4] = String.valueOf(registration.getSemester());
		}
		
		// Course Registration
		ArrayList<Course> availableCourses = database.getCourses();
		ArrayList<String> codeList = new ArrayList<String>();
		for (Course course : availableCourses) {
			if (!course.isEnabled()) continue;
			codeList.add(course.getCourseCode());
		}
		
		// Pay Fees
		double fees = student.getPendingFees();
		
		studentView.display(student.getName(), registeredArray, codeList, fees);
	}
	
	public void dropCourse(String courseCode) {
		database.removeRegistration(student.getMatricNumber(), courseCode);
		
		studentView.alert("Sucessfully dropped course");
		this.displayStudentView();
	}
	
	public void registerCourse(String courseCode, String session, int semester) {
		// checks if already registered before
		if (database.getRegistration(student.getMatricNumber(), courseCode) != null) {
			studentView.alert("You have already registered in this course!");
			this.displayStudentView();
			return;
		}
		
		Course course = database.getCourse(courseCode);
		Registration registration = new Registration(student, course, session, semester);
			
		student.setPendingFees(student.getPendingFees() + course.getFee());
		
		database.updateStudent(student);
		database.addRegistration(registration);
		
		studentView.alert("Successfully registered course");
		this.displayStudentView();
	}
	
	public void makePayment(String method, double amount) {
		Payment payment = new Payment(student, method, amount);
		
		student.setPendingFees(student.getPendingFees() - amount);
		
		database.updateStudent(student);
		database.addPayment(payment);
		
		studentView.alert("Successfully made payment");
		this.displayStudentView();
	}
}
