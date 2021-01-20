package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define array
		String[] cities = {"New York", "San Fran", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//Declare and define an array (Size only)
		

		
		//Declare an array
		String[] countries;
		
		// Define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1]= "Canada";
		countries[2]= "UK";
		System.out.println(countries[1]);
		
		System.out.println("++++++++++++++++++++");
		
		
		String[] states = new String[5];
		states[0] = "Cali";
		states[1]="Ohio";
		states[2]="New Jersey";
		states[3]="Texas";
		states[4]= "Utah";
		
		int i = 0;
		
		// Do Loop: enters the loop THEN test the condition
		
		do {
			System.out.println("State: " + states[i]);
			i = i + 1;
		} while (i < 5);
		
		// While Loop: test the condition first then enters the loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("State found");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("\nPrinting with for loop");
		// For Loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}

	}

}
