package basics;

public class Whether {
	public static void main(String[] args) {
		//This program will give suggestions of what to wear based on the temperature and sun condition
		
		int temperature =45;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant outside. Wear shorts and a t-shirt");
		}
		
		else if (temperature > 60 && sunCondition =="Sunny") {
			System.out.println("It's a little cooler outside. Perhaps wear a long sleeve t-shirt and jeans");
			System.out.println("Wear hat to keep sun out of eyes");
		}
		else if (temperature > 50 || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day. Wear warmer clothes");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater");
		}
			
		System.out.println("The Program is ending");
		
	}

}
