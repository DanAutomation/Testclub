package Lesson3;

public class PreIntermediate_6 {

	public static void main(String[] args) {
		int[] arr = {5, 17, 13, 24, 51, 82, 34, 41, 68};
		int sum = 0;
		double avg;
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i];
			avg = (double)sum / arr.length;
		}
	}
}