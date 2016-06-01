package Lesson3;

public class PreIntermediate_7 {
	public static void main(String[] args) {
		int[] arr = {5, 17, 13, 24, 51, 82, 34, 41, 68};
		int min = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++){
			if(min>arr[i])
				min = arr[i];
			for(int j = 0; j < arr.length; j++){
				if(max<arr[j])
					max = arr[j];
			}
		}
		System.out.println(max*2);
		System.out.println(min*2);
}
}