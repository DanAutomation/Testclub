package Lesson3;

public class PreIntermediate_4 {
	public static void main(String[] args){
	int[] arr = {5, 17, 13, 24, 51, 82, 34, 41, 68, 121, 144};
	for(int i = arr.length / 2; i < arr.length-1; i++){
		System.out.print(String.format("%d ", arr[i]));
	}
	System.out.println(String.format("%d ", arr[arr.length-1]));
}
}