package Lesson3;

public class PreIntermediate_11 { 
	public static void main(String[] args){
		int[] arr = {2, 15, 21, 41, 2, 54, 1, 2, 3, 45, 874};
		System.out.println(method(arr));
	}
	
	public static boolean method(int[] arr){
		boolean array = false;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 1 && arr[i+1] == 2 && arr[i+2] == 3){
				return true;
			}
		}
		return array;	
	}
}