package oop;

public class BankAccount implements IRate {

	// Define variables
	String accountNumber;
	
	// static >> belongs to the class not the object instance
	// final >> constant (often static final)
	private static final String routingNumber = "0312232";
	
	// Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definitions: unique methods
		// 1. used to define / setup / initialise properties of an object
		// 2. Constructors are implicitly called upon upon Instantiation
		// 3. Same name as the class itself
		// 4. Constructors have no return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Overloading: same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT CREATED: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT CREATED: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minumin deposit must be at leat $1000";
			System.out.println(Msg);
		} else {
			Msg = "Thanks for you initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	
	
	// Getters and Setters
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr. "+ name;
	}
	public String getName () {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	// Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	
	//Define Methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	// Private : can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS : $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus(){
		
	}
	
	@Override
	public String toString() {
		return "[ NAME:" + name + ". ACCOUNT#" + accountNumber + ". ROUTING #" + routingNumber + ". BALANCE: $" + balance + " ]";
	}
	
}
