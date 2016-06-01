package Lesson3;

public class Begginer_1 {

	public static void main(String[] args) {
		int[] arr = {1, 12, 42, 13, 57, 42, 64, 28, 64, 125};
        int i;
		for (i = 0; i < arr.length; i++){
            arr[i] *= 3;
			System.out.print(arr[i] + " ");
		}
	}
}