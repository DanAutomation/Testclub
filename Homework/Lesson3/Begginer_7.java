package Lesson3;

public class Begginer_7 {

	public static void main(String[] args) {
		int[] arr = { -5, -112, -74, -11, -21, -12, -144 }; // array
		int max = Integer.MIN_VALUE; // enter var
		for (int i = 0; i < arr.length; i++) { // bust of every element of array
			if (arr[i] > max) { // is element bigger than var
				max = arr[i]; // assign element to ver max
			}
		}
		System.out.println(max); // output max
	}
}