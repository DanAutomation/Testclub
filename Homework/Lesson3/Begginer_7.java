package Lesson3;

public class Begginer_7 {

	public static void main(String[] args) {
		int[] arr = { -5, -112, -74, -11, -21, -12, -144 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}