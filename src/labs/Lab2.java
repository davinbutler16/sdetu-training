package labs;

public class Lab2 {

	public static void main(String[] args) {
		// Create a Student
		Student stu1 = new Student("Janelle", "34723832892");
		Student stu2 = new Student("Janelle", "34353345477");
		Student stu3 = new Student("Janelle", "43523453212");
		
		stu1.enroll("Math");
		stu1.enroll("English");
		stu1.enroll("History");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		System.out.println(stu1.toString());

	}

}


class Student {
	// Properties
	private static int iD = 0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	public String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	// Constructor
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@university.com";
		System.out.println("Your email is: " + email);
	}
	
	public String getEmail() {
		return email;
	}
	
	private void setUserId () {
		int randNum = (int) (Math.random() * 8000) + 1000;
		userId = iD + "" + randNum + ssn.substring(6, 10);
		System.out.println("Your user ID is: " + userId);
	}
	
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment: $" + amount);
		System.out.println("New Balance: $"+ balance);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		balance = balance + costOfCourse;
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public String toString() {
		return "[NAME: " + name + "]\n[COURSES: " + courses + "]\n[BALANCE: " + balance + "]";
	}
	
}