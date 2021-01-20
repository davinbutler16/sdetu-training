package basics;

public class ArraysAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1 [] = {1, 2, 3, 53, 2, 64};
		System.out.println(max(array1));
		System.out.println(min(array1));
		System.out.println(ave(array1));
		System.out.println(averageArr(array1));
		
		
	}
	
	public static int max (int [] array) {
		int maxNum = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > maxNum) {
				maxNum = array[i];
			}
		}
		return maxNum;
	}
	
	public static int min (int [] array) {
		int minNum = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < minNum) {
				minNum = array[i];
			}
		}
		
		return minNum;
		
	} 
	
	public static float ave (int [] array) {
		float subTotal = 0;
		float total = 0;
		float average = 0;
		
		
		for (int i = 0; i < array.length; i = i + 2) {
			
			if (i == array.length - 1) {
				total = total + array[array.length-1];
				
			} else {
				subTotal = array[i] + array[i + 1];
				total = total + subTotal;
			}
				
			
		}
		average = (total / array.length);
		return average;
		
		
	} 
	
	//Other Solution ++++++++++++++++++++++++++++++++
	
	public static int averageArr(int[] array) {

		int total = 0;

		for (int i = 0; i < array.length; i++) {

		total = total + array[i];

		}

		return (total / array.length);

		}


	


}
