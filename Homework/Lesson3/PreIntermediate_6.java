package Lesson3;

public class PreIntermediate_6 {

	public static void main(String[] args) {
		int[] arr = {5, 17, 13, 24, 51, 82, 34, 41, 68}; // array
		int sum = 0; // initialization sum of numbers
		double avg; // initialization average of numbers
		for(int i = 0; i < arr.length; i++){ // bust of every element of array 
			sum = sum + arr[i]; // sum all elements
			avg = (double)sum / arr.length; // sum divide to quantity of elements
		}
	}
}