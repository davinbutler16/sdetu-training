package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord Of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The Book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "23242542";
		
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		//Print the initials of name plus last 4 digits of SSN
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,1));
		System.out.println(SSN.substring(4));
		
	}

}
