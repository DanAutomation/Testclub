package Lesson3;

public class Begginer_1 {

	public static void main(String[] args) {
		int[] arr = {1, 12, 42, 13, 57, 42, 64, 28, 64, 125}; //array
        int i;  // iterator
		for (i = 0; i < arr.length; i++){ // run iterator
            arr[i] *= 3; // multiply on 3
			System.out.print(arr[i] + " "); // through space
		}
	}
}