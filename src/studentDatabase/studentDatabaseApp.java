package studentDatabase;

import java.util.Arrays;

public class studentDatabaseApp {

	public static void main(String[] args) {
		
		Student student1 = new Student ("John", "3829838292", 100);
		
		System.out.println("---------------------------------");
		
		student1.payAmount(50);
		student1.enroll(4);
		student1.checkBalance();
		student1.setNumber("09834097044");
		System.out.println(student1.getNumber());
		student1.setCity("Dublin");
		System.out.println(student1.getCity());
		student1.setState("Leinster");
		System.out.println(student1.getState());
		student1.showCourses();





	}


}


class Student {
	// properties of Student
	private static int iD = 100; // internal id
	private String userId; // is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
	private String name;
	private String SSN;
	private String email;
	private double balance;
	String [] courses = new String[] {"Chemistry","Computing","Digital Media","Software","Science"};
	private String number;
	private String state;
	private String city;
	

	
	
	//Constructor 1
	public Student (String name, String SSN, double initDeposit) {
		System.out.println("Student Account Created");
		balance = initDeposit;
		this.SSN = SSN;
		this.name = name;
		iD++;
		setUserId();
		setEmail();
		enroll(4);
		

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


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	private void setUserId() {
		int random = (int) (Math.random() * 8000) + 1000;
		userId = iD  + "" + random + SSN.substring(6, 10);
		System.out.println("User ID is: "+ userId);
	}
	
	private void setEmail() {
		email = name + iD + "@" + "college.com";
		System.out.println("Email is: "+ email);
	}
	
	
	public void enroll(int courseNum) {
		String enrolledIn = courses[courseNum];
		System.out.println("Student is now enrolled in : " + enrolledIn);
		
	}
	
	public void checkBalance() {
		System.out.println("Balance is :" + balance);
	}
	
	public void payAmount(int bill){
		balance = balance - bill;
		System.out.println("Paid amount of: "  + bill + "\nNew Balance is: " + balance);
	}
	
	
	public void showCourses() {
		System.out.println("All courses offered are: ");
		System.out.println(Arrays.toString(courses));
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[ID: " + userId + "]\n" + "[Email: " + email + "]\n" + "[Balance: " + balance + "]\n\" + \"[City: \" + city + \"]\n+ \"[Phone: \" + number + \"]";
	}
	
	

	
	
}
