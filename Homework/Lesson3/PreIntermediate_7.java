package Lesson3;

public class PreIntermediate_7 {
	public static void main(String[] args) {
		int[] arr = {5, 17, 13, 24, 51, 82, 34, 41, 68}; //array
		int min = 0; // initialize min variable
		int max = 0; // initialize min variable
		for (int i = 0; i < arr.length; i++){ // bust of elements array
			if(min>arr[i]) // is min smaller than i-elements of array?
				min = arr[i]; // input in min smallest element of array
			for(int j = 0; j < arr.length; j++){ // bust of elements array again for finding max
				if(max<arr[j]) // is max the bigge than element any of i-elements of array?
					max = arr[j]; // yes
			}
		}
		System.out.println(max*2); // multiply on 2 max
		System.out.println(min*2); // multiply on 2 max
}
}