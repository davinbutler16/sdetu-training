package basics;

public class Assignment1 {

	public static void main(String[] args) {
		

			
		System.out.println(sum(5));
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		System.out.println(fib(3));
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		System.out.println(fac(5));
		
		
		
		
		
	}
	
	
	// Write a function that takes a value of n and returns the sum of numbers 1 to n	
	public static int sum(int n) {
		int i;
		int total = 0;
		int subtotal = 0;
		
		for (i = 0; i < n; i++) {
			subtotal = n - i;
			total = total + subtotal;
			System.out.println(subtotal);
			
		} 
		return total;
		
		
	}
	
	//  Other solution +++++++++++++++++++++++++++++++
		public static int calculateSum(int n) {
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
		
		sum += i;
		
		}
		
		return sum;
		
		}
		

	
	
	
	
	// Write a function which returns entire fibonaci index
	
	/*
	 * Fibonaci number is defined by the sum of the 2 previous fibonaci numbers
	 * 
	 * 
	 * fib(0) = 0
	 * fib(1) = 1
	 * fib(2) = fib(1) + fib(0) = 1 + 0 = 1
	 * fib(3) = fib(2) + fib(1) = 1 + 1 = 2
	 * fib(4) = fib(3) + fib(2) = 2 + 1 = 3
	 * fib(5) = fib(4) + fib(3) = 3 + 2 + 5
	 * 
	 *
	 */
	public static long fib(int n) {
		
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		long fibTerm = (fib(n-1) + fib(n-2));
		return fibTerm;
	}
	
	
	//Write a function which computes the factorial value of a number
	// n! = n*(n-1) , where 0! = 1
	/* 
	 
	 0! = 1
	 
	 1! = 1
	 
	 2! = 2*1!  = 2*1
	 
	 3! = 3*2!  = 3*2*1! = 3*2*1
	 
	 4! = 4*3!  = 4*3*2! = 4*3*2*1
	 
	 */
	
	
public static long fac(int n) {
	
		if (n == 1) {
			System.out.println("factorial(" + n + ") = 1");
			return 1;
		}
		else {
			System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n-1) + ")");
			return n * fac(n-1);
		}
		
	}


 // Other solution +++++++++++++++++++++++++++++++++++++++++++++++

public static int factorial(int n) {

		if (n == 0) {
		
			return 1;
		
		}
		
		else if (n == 1) {
		
			return 1;
		
		}
		
		return(factorial(n-1)*n);

}





	
	
}
