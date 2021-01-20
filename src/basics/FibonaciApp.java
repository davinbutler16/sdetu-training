package basics;

public class FibonaciApp {

	public static void main(String[] args) {
		// Fibonaci number is defined by the sum of the two previous fibonaci numbers
		

		System.out.println(fib(4));
	}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
			
		}
		
		else if (n == 1) {
			return 1;
		}
		
		return (fib (n-1) + fib (n-2));
	}
	
	
	

}
